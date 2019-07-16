package xyz.tmlh.webscoket.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *   IndexController
 * </p>
 *
 * @author TianXin
 * @since 2019年5月5日下午7:18:11
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/add")
    public String add(HttpSession session) {
        session.setAttribute("user", "Tom");
        return "index";
    }
    
    @GetMapping("/remove")
    public String remove(HttpSession session) {
        session.removeAttribute("user");
        return "index";
    }
    
}
