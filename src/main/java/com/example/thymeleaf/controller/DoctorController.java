package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class DoctorController{

    @GetMapping("/doctor/")

   
    public String doctor  (Model model, @RequestParam (value = "name", defaultValue = "Go Dr.House") String name, @RequestParam(value = "number", defaultValue = "1") String number) {

	
		model.addAttribute("number", number);
		model.addAttribute("name", name);
    	
        return "doctor";
    }
}
