package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ServiceRef implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.String href;

	public ServiceRef() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getHref() {
		return this.href;
	}

	public void setHref(java.lang.String href) {
		this.href = href;
	}

	public ServiceRef(java.lang.String id, java.lang.String href) {
		this.id = id;
		this.href = href;
	}

}