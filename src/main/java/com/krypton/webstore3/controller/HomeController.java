package com.krypton.webstore3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Web Store!");
        model.addAttribute("tagline", "The one and only amazing web store");
//        return "welcome"; // es igual que redirect:/welcome/greeting
        return "forward:/welcome/greeting"; // trasladada los datos de una solicitud a otra, JSP a otro, y así.
//     return "redirect:/welcome/greeting"; // redirije a una nueva solicitud totalmente diferente [pierde los datos]

    }

    @RequestMapping("/welcome/greeting")
    public String greeting() {
        return "welcome";
    }

}
