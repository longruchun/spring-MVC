package com.eshop.dao;

import java.util.List;

import com.eshop.model.shopMenu;
import com.eshop.model.shopMenuKey;

public interface IshopMenuMapper {
    int deleteByPrimaryKey(shopMenuKey key);

    int insert(shopMenu record);

    int insertSelective(shopMenu record);

    shopMenu selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(shopMenu record);

    int updateByPrimaryKey(shopMenu record);
    
    List<shopMenu> getModelsByPid(int pid);
    
    List<shopMenu> getAll();
}