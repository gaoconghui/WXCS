package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Resource_Attribute;

public interface ResourceAttributeDao {

	public void insert(Resource_Attribute ra);
	public Resource_Attribute getById(long id);
	public void update(Resource_Attribute ra);
	public void deleteById(long id);
	
	//获取服务资源对应的属性值
	public  List<Resource_Attribute>  getByResourceId(long id);
	
	//根据一组属性查询， 但是怎么进行组合查询？多个属性怎么办？ 
	//解决方案1：使用交集查询
	public  List<Resource_Attribute>  getByAttribute(List<String> value);
	
	
}
