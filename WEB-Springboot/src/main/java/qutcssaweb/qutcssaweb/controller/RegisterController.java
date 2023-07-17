package qutcssaweb.qutcssaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @GetMapping("register/goHomePage")
    public String goRegisterPage(){
        System.out.println("goRegisterPage used");
        return "index";
    }
}
