package org.xtremebiker.jsfspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("Hello");
        return "hello";
    }
    @RequestMapping("/")
    public String redirectHome(){
        return "redirect:ui/hello.xhtml";
    }
}
