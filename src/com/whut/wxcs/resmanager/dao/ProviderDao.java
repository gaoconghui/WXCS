package com.whut.wxcs.resmanager.dao;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Provider;


public interface ProviderDao {
	
	public void insert(Provider provider);
	public Provider getById(long id);
	public void update(Provider provider);
	public void deleteById(long id);
	
	//获取所有提供商
	public List<Provider> getAll();
	
	//根据行业查找提供商
	public List<Provider> getByIndustry(String industry);

}
