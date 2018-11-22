package com.eshop.dao;

import com.eshop.model.shopDept;

public interface IshopDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopDept record);

    int insertSelective(shopDept record);

    shopDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopDept record);

    int updateByPrimaryKey(shopDept record);
}