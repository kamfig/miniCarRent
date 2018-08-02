package pl.KamilF.miniSelfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.KamilF.miniSelfProject.dao.ModelDao;
import pl.KamilF.miniSelfProject.dao.TypDao;
import pl.KamilF.miniSelfProject.model.Model;
import pl.KamilF.miniSelfProject.model.Typ;

@Controller
public class ModelController {

    @Autowired
    private TypDao typDao;

    @Autowired
    private ModelDao modelDao;

    @GetMapping("/model")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("model", new Model());
        modelMap.addAttribute("types",typDao.findAll());
        //modelMap.put("typ",typDao.findAll());
        return "model/add";
    }

    @PostMapping("/model/add")
    public String save(@ModelAttribute Model model, ModelMap modelMap) {
        modelMap.put("model", model);
        modelDao.save(model);
        return "redirect:/model/all";
    }

    @GetMapping("model/all")
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("models", modelDao.findAll());
        return "model/all";
    }
}
