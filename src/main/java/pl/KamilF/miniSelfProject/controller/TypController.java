package pl.KamilF.miniSelfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.KamilF.miniSelfProject.dao.TypDao;
import pl.KamilF.miniSelfProject.model.Typ;

@Controller
public class TypController {

    @Autowired
    private TypDao typDao;


    @GetMapping("/typ")
    public String add(ModelMap modelMap){
        modelMap.addAttribute("typ",new Typ());
        return "typ/add";
    }

    @PostMapping("typ/add")
    public String create(@ModelAttribute Typ typ){
        typDao.save(typ);
        return "redirect:/typ/all";
    }

    @GetMapping("/typ/all")
    public String findAll(ModelMap modelMap){
        modelMap.addAttribute("types",typDao.findAll());
        return "typ/all";
    }
}
