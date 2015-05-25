package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.ResourceAttribute;

public interface ResourceAttributeDao {

	public void insert(ResourceAttribute ra);
	public ResourceAttribute getById(long id);
	public void update(ResourceAttribute ra);
	public void deleteById(long id);
	
	//获取服务资源对应的属性值
	public  List<ResourceAttribute>  getByResourceId(long id);
	
	//根据一组属性查询， 但是怎么进行组合查询？多个属性怎么办？ 
	//解决方案1：使用交集查询
	public  List<ResourceAttribute>  getByAttribute(List<String> value);
	
	
}
