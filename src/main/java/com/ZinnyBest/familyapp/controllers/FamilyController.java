package com.ZinnyBest.familyapp.controllers;

import com.ZinnyBest.familyapp.models.Family;
import com.ZinnyBest.familyapp.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/families")
public class FamilyController {

    @Autowired private FamilyService familyService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Family> families = familyService.getAll();
        model.addAttribute("families",families);

        String username = "Zinny";
        model.addAttribute("username",username);

        return "families";
    }
    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Family> getOne(Integer Id){
        return familyService.getOne(Id);
    }
    @PostMapping("/addNew")
    public String addNew(Family family){
        familyService.addNew(family);
        return "redirect:/families/getAll";
    }
    @RequestMapping(value = "/update/{Id}",method = {RequestMethod.GET,RequestMethod.PUT})
    public String Update(Family family){
        familyService.update(family);
        return"redirect:/families/getAll";
    }

    @DeleteMapping(value="/delete")
    public String delete(Integer Id){
        familyService.delete(Id);
        return "redirect:/families/getAll";
    }


}

