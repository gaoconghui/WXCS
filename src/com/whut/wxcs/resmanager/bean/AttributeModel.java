package com.whut.wxcs.resmanager.bean;

public class AttributeModel {

	private long id;
	private String attributeName;
	private byte attributeType;
	private String attributeDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public byte getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(byte attributeType) {
		this.attributeType = attributeType;
	}

	public String getAttributeDescription() {
		return attributeDescription;
	}

	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
	}

	@Override
	public String toString() {
		return "AttributeModel [id=" + id + ", attributeName=" + attributeName
				+ ", attributeType=" + attributeType
				+ ", attributeDescription=" + attributeDescription + "]";
	}

}
