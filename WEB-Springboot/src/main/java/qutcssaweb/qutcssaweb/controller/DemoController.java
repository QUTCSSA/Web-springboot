package qutcssaweb.qutcssaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/demo")
    public String DemoController(Model model) {
        System.out.println("text");
        model.addAttribute("msg","hello");
        return "demo";
    }
}
