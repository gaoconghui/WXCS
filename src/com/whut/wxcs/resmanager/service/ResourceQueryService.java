package com.whut.wxcs.resmanager.service;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Catalogue;

public interface ResourceQueryService {
	
	/**
	 * 查看服务资源类目分类树，即获取全部
	 * 考虑是否直接使用静态页面？
	 * @return 
	 */
	public List<Catalogue[]> getCatalogueTree();

}
