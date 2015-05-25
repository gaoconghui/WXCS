package com.whut.wxcs.resmanager.service;

import java.util.List;

import com.whut.wxcs.resmanager.bean.Catalogue;
import com.whut.wxcs.resmanager.bean.Resource;
import com.whut.wxcs.resmanager.web.CritialResource;

public interface ResourceQueryService {
	
	/**
	 * 查看服务资源类目分类树，即获取全部
	 * 考虑是否直接使用静态页面？
	 * @return 
	 */
	public List<Catalogue[]> getCatalogueTree();
	
	/**
	 * 根据传入的叶类目ID 获得资源
	 * @return
	 */
	public List<Resource> getResourceByLeafCatalogue(String id);
	
	/**
	 * 根据传入的非叶类目ID 获得一组资源
	 * @return
	 */
	public List<Resource[]> getResourceLeafCatalogue(String id);
	
	/**
	 * 根据传入的一组属性id获得资源
	 * @param id
	 * @return
	 */
	public List<Resource> getResourceByAttribute(List<String> id);

	/**
	 * 根据传入的key获得资源
	 * @param id
	 * @return
	 */
	public List<Resource> getResourceByKey(String key);
	
	/**
	 * 根据传入的组合信息查找资源
	 * @param id
	 * @return
	 */
	public List<Resource> getResourceByUnion(CritialResource c);
	
	/**
	 * 根据传入供应商ID 来查询资源
	 * @param id
	 * @return
	 */
	public List<Resource> getResourceByProvider(int id);

	/**
	 * 根据传ID查询资源
	 * @param id
	 * @return
	 */
	public Resource getResourceDetail(int id);

}
