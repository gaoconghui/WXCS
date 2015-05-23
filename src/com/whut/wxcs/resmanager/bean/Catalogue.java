package com.whut.wxcs.resmanager.bean;

public class Catalogue {

	private String id;
	private String parentId;
	private String name;
	private String description;
	private boolean isLeaf;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	@Override
	public String toString() {
		return "Catalogue [id=" + id + ", parentId=" + parentId + ", name="
				+ name + ", description=" + description + "]";
	}

}
