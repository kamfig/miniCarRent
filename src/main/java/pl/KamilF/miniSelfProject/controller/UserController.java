package pl.KamilF.miniSelfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.KamilF.miniSelfProject.dao.UserDao;
import pl.KamilF.miniSelfProject.model.User;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/user")
    public String add(ModelMap modelMap){
        modelMap.addAttribute("user", new User());
         return "user/add";
    }

    @PostMapping("user/add")
    public String create(@ModelAttribute User user){
        userDao.save(user);
        return "redirect:/user/all";
    }

    @GetMapping("/user/all")
    public String findAll(ModelMap modelMap){
        modelMap.addAttribute("users", userDao.findAll());
        return "user/all";
    }
}
