package com.whut.wxcs.resmanager.bean;

public class ResourceAttribute {

	private long resourceId;
	private long attributeId;
	private String attributeValue;

	public long getResourceId() {
		return resourceId;
	}

	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}

	public long getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(long attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Override
	public String toString() {
		return "Resource_Attribute [resourceId=" + resourceId
				+ ", attributeId=" + attributeId + ", attributeValue="
				+ attributeValue + "]";
	}

}
