package com.eshop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eshop.biz.IshopMenuBiz;
import com.eshop.biz.impl.shopMenuBizImpl;
import com.eshop.model.sysmenu;

@Controller
@RequestMapping(value="/resource")
public class resourceController {
	
	IshopMenuBiz biz;
	
	@Resource(name="shopMenuBizImpl")
    public void setBiz(IshopMenuBiz biz) {
		this.biz = biz;
	}


	@RequestMapping(value="/getMenus",method=RequestMethod.GET)
    @ResponseBody
	public  List<sysmenu> getMenus() {
 		return biz.getMenus();
    }
}
