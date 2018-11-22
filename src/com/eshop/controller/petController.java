package com.eshop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eshop.biz.IshopPetBiz;
import com.eshop.model.shopPet;

@Controller
@RequestMapping(value="/pet")
public class petController {
    
	IshopPetBiz biz;
	
	
	
	@Resource(name="shopPetBizImpl")
	public void setBiz(IshopPetBiz biz) {
		this.biz = biz;
	}




	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("list",biz.getAll());
		return "/pet/index";
	}
}
