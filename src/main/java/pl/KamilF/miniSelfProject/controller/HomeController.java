package pl.KamilF.miniSelfProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.KamilF.miniSelfProject.model.Model;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){

        return "home/home";
    }
}
