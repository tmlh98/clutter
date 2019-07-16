package xyz.tmlh.webscoket.suport;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>
 * MyWebSocket
 * </p>
 *
 * @author TianXin
 * @since 2019年5月5日下午7:06:22
 */
@ServerEndpoint(value = "/websocket",configurator = HttpSessionConfigurator.class)  
@Component  
public class MyWebSocket {

    private Logger log = LoggerFactory.getLogger(this.getClass()); // 处理连接建立

    // 保存所有在线socket连接
    private static Map<String, MyWebSocket> webSocketMap = new LinkedHashMap<>();
    // 记录当前在线数目
    private static int count = 0;
    // 当前连接（每个websocket连入都会创建一个MyWebSocket实例
    private Session session;

    @OnOpen
    public void onOpen(Session session,EndpointConfig config) {
        HttpSession httpSession= (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        log.info("SESSION_ID:{} , session Name : {}" ,httpSession.getId(),HttpSession.class.getName());
        log.info("user:{}" ,httpSession.getAttribute("user"));
        this.session = session;
        webSocketMap.put(session.getId(), this);
        addCount();
        log.info("新的连接加入：{},当前在线数目 ：{}", session.getId(), count);
    }

    // 接受消息
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到客户端{}消息：{}", session.getId(), message);
        try {
            this.sendMessage("收到消息：" + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 处理错误
    @OnError
    public void onError(Throwable error, Session session) {
        log.info("发生错误{},{}", session.getId(), error.getMessage());
    }

    // 处理连接关闭
    @OnClose
    public void onClose() {
        webSocketMap.remove(this.session.getId());
        reduceCount();
        log.info("连接关闭:{} ,数目：{}", this.session.getId() ,count);
    }

    // 群发消息
    // 发送消息
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    // 广播消息
    public static void broadcast() {
        MyWebSocket.webSocketMap.forEach((k, v) -> {
            try {
                v.sendMessage("这是一条测试广播");
            } catch (Exception e) {
            }
        });
    }

    // 获取在线连接数目
    public static int getCount() {
        return count;
    }

    // 操作count，使用synchronized确保线程安全
    public static synchronized void addCount() {
        MyWebSocket.count++;
    }

    public static synchronized void reduceCount() {
        MyWebSocket.count--;
    }
}
