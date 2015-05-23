package com.whut.wxcs.resmanager.bean;

import java.sql.Date;

public class Resource {

	private long id;
	private String resource_name;
	// 所属模板ID
	private String templateId;
	private String description;
	// 所属类目ID（编号，13位）
	private String catalogueId;
	private String providerId;
	private Date creat_time;
	private Float rating;
	// 权限
	private int right;
	// 拥有相同的资源的数目
	private int amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCatalogueId() {
		return catalogueId;
	}

	public void setCatalogueId(String catalogueId) {
		this.catalogueId = catalogueId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public Date getCreat_time() {
		return creat_time;
	}

	public void setCreat_time(Date creat_time) {
		this.creat_time = creat_time;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", resource_name=" + resource_name
				+ ", templateId=" + templateId + ", description=" + description
				+ ", catalogueId=" + catalogueId + ", providerId=" + providerId
				+ ", creat_time=" + creat_time + ", rating=" + rating
				+ ", right=" + right + ", amount=" + amount + "]";
	}

}
