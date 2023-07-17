package qutcssaweb.qutcssaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomePageController {


    @GetMapping("/JoinUsPage")
    public String goJoinUsPage( ){
        System.out.println("into goJoinUsPage");
        return "register";
    }
}
