package com.eshop.biz;

import java.util.List;


import com.eshop.model.shopMenu;

public interface IBaseBiz<T> {
	int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
    
    List<T> getAll();
}
