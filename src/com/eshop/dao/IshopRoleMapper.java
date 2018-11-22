package com.eshop.dao;

import com.eshop.model.shopRole;

public interface IshopRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopRole record);

    int insertSelective(shopRole record);

    shopRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopRole record);

    int updateByPrimaryKey(shopRole record);
}