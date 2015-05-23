package com.whut.wxcs.resmanager.bean;

import java.sql.Date;

public class ResourceModel {

	private long id;
	private String ResourceName;
	private String description;
	private String CatalogueId;
	private Date creatTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResourceName() {
		return ResourceName;
	}

	public void setResourceName(String resourceName) {
		ResourceName = resourceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCatalogueId() {
		return CatalogueId;
	}

	public void setCatalogueId(String catalogueId) {
		CatalogueId = catalogueId;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	@Override
	public String toString() {
		return "ResourceModel [id=" + id + ", ResourceName=" + ResourceName
				+ ", description=" + description + ", CatalogueId="
				+ CatalogueId + ", creatTime=" + creatTime + "]";
	}

}
