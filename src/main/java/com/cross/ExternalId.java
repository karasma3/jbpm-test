package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ExternalId implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String systemId;
	private java.lang.String externalId;
	private java.lang.Boolean primary;

	public ExternalId() {
	}

	public java.lang.String getSystemId() {
		return this.systemId;
	}

	public void setSystemId(java.lang.String systemId) {
		this.systemId = systemId;
	}

	public java.lang.String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(java.lang.String externalId) {
		this.externalId = externalId;
	}

	public java.lang.Boolean getPrimary() {
		return this.primary;
	}

	public void setPrimary(java.lang.Boolean primary) {
		this.primary = primary;
	}

	public ExternalId(java.lang.String systemId, java.lang.String externalId,
			java.lang.Boolean primary) {
		this.systemId = systemId;
		this.externalId = externalId;
		this.primary = primary;
	}

}