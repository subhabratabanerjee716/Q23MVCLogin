package com.login.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.demo.Entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/form")
	public String openForm(Model m) {
		
		System.out.println("Opening form ");
		
		m.addAttribute("loginData", new LoginData());
		
		return "form";
		
		
	}
	
	//handler for processing form
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			
			System.out.println(result);
			
			return "form";
			
		}
		
		loginData.setPassword(loginData.getPassword().replace('b','*'));
		
		System.out.println(loginData);
		
		return "success";
		
	}

}
