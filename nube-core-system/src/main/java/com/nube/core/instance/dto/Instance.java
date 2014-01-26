package com.nube.core.instance.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * This is for an installation, not for a context
 * 
 * @author kamoorr
 * 
 */
@Entity
@Table(name = "INSTANCE")
@Cacheable(true)
public class Instance implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Instance(){
		
	}

	public Instance(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Id
	@Column(name = "KEY")
	private String key;

	@Column(name = "VALUE", nullable = true, length=1000)
	private String value;

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATED_DT", nullable = false, columnDefinition="DATE default CURRENT_DATE", insertable=false, updatable=false)
	private Date lastModifiedDate;

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

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Instance other = (Instance) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Instance [key=" + key + ", value=" + value + "]";
	}

}
