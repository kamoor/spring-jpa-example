package com.nube.core.vo.apps;

/**
 * Application information. This can be used to represent any application
 * @author kamoorr
 *
 */
public class App {

	private int id;
	private String name;
	private String descr;
	private AppStatus status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public AppStatus getStatus() {
		return status;
	}
	public void setStatus(AppStatus status) {
		this.status = status;
	}
	
	
}
