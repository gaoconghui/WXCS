package com.whut.wxcs.resmanager.dao;

import com.whut.wxcs.resmanager.bean.Attribute;

public interface AttributeDao {

	public void insert(Attribute attribute);
	public Attribute getById(long id);
	public void update(Attribute attribute);
	public void deleteById(long id);
	
}
