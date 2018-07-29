package pl.KamilF.miniSelfProject.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Auto {

    @GetMapping("/all")
    public String hello(){
        return "HelloAll";
    }
}
