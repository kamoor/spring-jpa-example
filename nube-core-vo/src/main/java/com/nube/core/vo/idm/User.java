package com.nube.core.vo.idm;

import java.util.List;
import java.util.ArrayList;


import com.nube.core.vo.common.Attribute;

/**
 * Common User Representation
 * 
 * @author kamoorr
 * 
 */

public class User {

	private int id;
	private String context;
	private String userName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private UserStatus status;
	private IdmSource idmSource;

	private String cellPhone;
	private String homePhone;
	private String fax;

	/* custom page url, it can be used as subdomain in blogs */
	private String handle;

	private java.util.List<Attribute> attributes;

	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String useName) {
		this.userName = useName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public IdmSource getIdmSource() {
		return idmSource;
	}

	public void setIdmSource(IdmSource idmSource) {
		this.idmSource = idmSource;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public java.util.List<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new ArrayList<Attribute>();
		}
		return attributes;
	}

	public void setAttributes(java.util.List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public void addAttribute(Attribute attr) {
		this.getAttributes().add(attr);
	}

	/**
	 * Remove an attribute
	 * 
	 * @param attr
	 * @return
	 */
	public boolean removeAttribute(Attribute attr) {
		return this.getAttributes().remove(attr);
	}

}
