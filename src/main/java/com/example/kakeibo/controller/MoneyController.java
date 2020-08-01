package com.example.kakeibo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.kakeibo.entity.Category;
import com.example.kakeibo.form.MoneyForm;
import com.example.kakeibo.service.MoneyService;

@RequestMapping("/money")
@Controller
public class MoneyController {
	
	@Autowired
	MoneyService moneyService;
	
	@RequestMapping(value="/new",method = RequestMethod.POST)
	public String newIndex(MoneyForm form, Model model) {
		List<Category> categoryList = moneyService.getCategory();
		return "newcreate";
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(MoneyForm form, Model model) {
		
		model.addAttribute("insertFlag",true);
		return newIndex(form, model);
	}
}
