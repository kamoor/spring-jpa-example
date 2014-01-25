package com.nube.core.vo.system;

/**
 * Properties to get run application 
 * @author kamoorr
 *
 */
public class Properties {
	
	String key;
	String value;
	String context = "NA";
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	

}
