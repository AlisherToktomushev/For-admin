package com.alisher.security.Controller;

import com.alisher.security.DAO.IceDAO;
import com.alisher.security.Service.ServiceImpl;
import com.alisher.security.model.IceCream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    private ServiceImpl service;

    @GetMapping("/")
    public String forAllPerson(){
        return "allPerson";
    }

    @GetMapping ("/addIce")
    public String add(Model model){
        IceCream iceCream= new IceCream();
        model.addAttribute("ice",iceCream);
        return "for-admin";
    }
    @RequestMapping("/saveIce")
    public String save(@ModelAttribute("ice") IceCream cream){
        service.save(cream);
        return "redirect:for-admin";
    }
    
}
