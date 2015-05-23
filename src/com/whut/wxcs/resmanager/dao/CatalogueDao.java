package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Catalogue;

public interface CatalogueDao {

	public void insert(Catalogue catalogue);
	public Catalogue getById(long id);
	public void update(Catalogue catalogue);
	public void deleteById(long id);
	
	//如果父节点为0，即为根节点
	public List<Catalogue> getAllRoot();
	
	//获取所有的子节点目录
	public List<Catalogue> getChildCatalogue(long id);
	
}
