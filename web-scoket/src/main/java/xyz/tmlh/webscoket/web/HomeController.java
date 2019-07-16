package xyz.tmlh.webscoket.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.tmlh.webscoket.suport.MyWebSocket;

@RestController
public class HomeController {
    
    @GetMapping("/broadcast")
    public void broadcast() {
        MyWebSocket.broadcast();
    }
    
    @GetMapping("/login")
    public void login(HttpServletRequest request) {
        request.getSession().setAttribute("login_user", "root");
    }
    
    @GetMapping("/logout")
    public void logout(HttpServletRequest request) {
        request.getSession().removeAttribute("login_user");
    }
    
    
}
