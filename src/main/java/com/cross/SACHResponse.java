package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SACHResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.cross.ResourceRef node;
	private java.util.List<java.lang.String> serviceTypes;

	public SACHResponse() {
	}

	public com.cross.ResourceRef getNode() {
		return this.node;
	}

	public void setNode(com.cross.ResourceRef node) {
		this.node = node;
	}

	public java.util.List<java.lang.String> getServiceTypes() {
		return this.serviceTypes;
	}

	public void setServiceTypes(java.util.List<java.lang.String> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

	public SACHResponse(com.cross.ResourceRef node,
			java.util.List<java.lang.String> serviceTypes) {
		this.node = node;
		this.serviceTypes = serviceTypes;
	}

}