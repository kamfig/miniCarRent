package pl.KamilF.miniSelfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.KamilF.miniSelfProject.dao.AutoDao;
import pl.KamilF.miniSelfProject.dao.ModelDao;
import pl.KamilF.miniSelfProject.dao.UserDao;
import pl.KamilF.miniSelfProject.model.Auto;
import pl.KamilF.miniSelfProject.model.Model;


@Controller
public class AutoController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelDao modelDao;

    @Autowired
    private AutoDao autoDao;

    @GetMapping("/auto")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("auto", new Auto());
        modelMap.addAttribute("models",modelDao.findAll());
        modelMap.addAttribute("users",userDao.findAll());
        return "auto/add";
    }

    @PostMapping("/auto/add")
    public String save(@ModelAttribute Auto auto, ModelMap modelMap) {
        modelMap.put("auto", auto);
        autoDao.save(auto);
        return "redirect:/auto/all";
    }

    @GetMapping("auto/all")
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("autos", autoDao.findAll());
        return "auto/all";
    }
}
