package com.eshop.biz;

import java.util.List;

import com.eshop.model.shopMenu;
import com.eshop.model.sysmenu;

public interface IshopMenuBiz extends IBaseBiz<shopMenu> {
	List<shopMenu> getModelsByPid(int pid);
	List<sysmenu> getMenus();
}
