package com.whut.wxcs.resmanager.bean;

public class TAttributeValue {

	private Template template;
	private TemplateAttribute attribute;
	private String attributeValue;

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public TemplateAttribute getAttribute() {
		return attribute;
	}

	public void setAttribute(TemplateAttribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "TAttributeValue [template=" + template + ", attribute="
				+ attribute + ", attributeValue=" + attributeValue + "]";
	}



}
