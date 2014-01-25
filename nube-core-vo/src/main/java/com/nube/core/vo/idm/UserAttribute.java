package com.nube.core.vo.idm;

import com.nube.core.vo.common.Attribute;

/**
 * Extended user attributes
 * @author kamoorr
 *
 */
public class UserAttribute implements Attribute{
	
	
	private String key;
	private String value;
	private String context;
	
	public UserAttribute(String key, String value){
		this.key = key;
		this.value = value;
	}
	
	
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAttribute other = (UserAttribute) obj;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	

}
