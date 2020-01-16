package xyz.tmlh.netty.examples.serve;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 群聊系统服务端
 */
public class GroupChatServe {

    /**
     * 暴露的端口
     */
    public static final int PORT = 6666;

    public ServerSocketChannel serverSocketChannel;


    public Selector selector;

    public EventHandler handler;

    public GroupChatServe() {
        init();

        handler = new EventHandler(selector);
    }

    /**
     * 初始化方法
     */
    public void init() {
        try {
            System.out.println("正在初始化" + this.getClass().getName() + " , 端口号为: " + PORT);

            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(PORT));

            selector = Selector.open();

            //注册serverSocket 并注册OP_ACCEPT事件
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 监听连接
     */
    public void listen() {
        System.out.println("服务端启动成功,正在监听!");

        for (; ; ) {
            try {
                int readyChannels = selector.selectNow();
                if (readyChannels == 0) continue;//如果没有就执行下一次监听

                Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();

                while (keyIterator.hasNext()) {
                    SelectionKey selectionKey = keyIterator.next();
                    //是否是OP_ACCEPT事件
                    if (selectionKey.isAcceptable()) {
                        // 监听请求
                        SocketChannel channel = serverSocketChannel.accept();
                        System.out.println(channel.getRemoteAddress() + "已上线!");
                        channel.configureBlocking(false);
                        channel.register(selector, SelectionKey.OP_READ);

                    }

                    if (selectionKey.isReadable()) {
                        //处理读事件
                        handler.read(selectionKey);
                    }

                    keyIterator.remove();
                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }


}
