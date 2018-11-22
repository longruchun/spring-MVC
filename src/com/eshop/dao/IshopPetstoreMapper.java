package com.eshop.dao;

import com.eshop.model.shopPetstore;

public interface IshopPetstoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopPetstore record);

    int insertSelective(shopPetstore record);

    shopPetstore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopPetstore record);

    int updateByPrimaryKey(shopPetstore record);
}