package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.RAttributeValue;

public interface ResourceAttributeDao {

	public void insert(RAttributeValue ra);
	public RAttributeValue getById(long id);
	public void update(RAttributeValue ra);
	public void deleteById(long id);
	
	//获取服务资源对应的属性值
	public  List<RAttributeValue>  getByResourceId(long id);
	
	//根据一组属性查询， 但是怎么进行组合查询？多个属性怎么办？ 
	//解决方案1：使用交集查询
	public  List<RAttributeValue>  getByAttribute(List<String> value);
	
	
}
