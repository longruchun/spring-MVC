package com.eshop.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eshop.biz.IshopPetBiz;
import com.eshop.dao.IshopPetMapper;
import com.eshop.model.shopPet;

@Service
public class shopPetBizImpl implements IshopPetBiz {
    
	IshopPetMapper dao;

	@Resource
	public void setDao(IshopPetMapper dao) {
		this.dao = dao;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(shopPet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(shopPet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public shopPet selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(shopPet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(shopPet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<shopPet> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
