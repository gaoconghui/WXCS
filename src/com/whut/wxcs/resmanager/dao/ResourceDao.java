package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Resource;

public interface ResourceDao {

	public void insert(Resource resource);
	public Resource getById(long id);
	public void update(Resource resource);
	public void deleteById(long id);
	
	public List<Resource> getAll();
	
	//根据提供商查找资源信息
	public List<Resource> getByProviderId(int id);
	
	//根据类目获取资源信息
	//注:若为非叶子类目，则获取全部，用LIKE 关键字
	public List<Resource> getByCatalogueId(String id);
	
}
