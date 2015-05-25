package com.whut.wxcs.resmanager.service;

import com.whut.wxcs.resmanager.web.CritialResource;

public interface ResourceManagerService {

	/**
	 * 先判断权限，符合权限则能进行修改操作
	 * 传入资源，对传入具体资源拆分，update 属性以及资源
	 */
	public void updateResource(CritialResource resource);
	
	
	/**
	 * 根据id 删除资源，以及资源对应的所有属性，事务
	 * @param id
	 */
	public void deleteResource(long id);
	
	/**
	 * 添加资源 根据传入的具体资源添加资源以及属性
	 * @param resource
	 */
	public  void insert(CritialResource resource);
	
}
