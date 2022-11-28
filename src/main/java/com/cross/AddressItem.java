package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AddressItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String crossId;
	private java.lang.String geometry;
	private java.lang.Boolean valid;
	private com.cross.ResourceRef countryRef;
	private java.util.List<com.cross.ExternalId> externalIds;
	private java.util.List<com.cross.CustomAttribute> customAttributes;

	public AddressItem() {
	}

	public java.lang.String getCrossId() {
		return this.crossId;
	}

	public void setCrossId(java.lang.String crossId) {
		this.crossId = crossId;
	}

	public java.lang.String getGeometry() {
		return this.geometry;
	}

	public void setGeometry(java.lang.String geometry) {
		this.geometry = geometry;
	}

	public java.lang.Boolean getValid() {
		return this.valid;
	}

	public void setValid(java.lang.Boolean valid) {
		this.valid = valid;
	}

	public com.cross.ResourceRef getCountryRef() {
		return this.countryRef;
	}

	public void setCountryRef(com.cross.ResourceRef countryRef) {
		this.countryRef = countryRef;
	}

	public java.util.List<com.cross.ExternalId> getExternalIds() {
		return this.externalIds;
	}

	public void setExternalIds(java.util.List<com.cross.ExternalId> externalIds) {
		this.externalIds = externalIds;
	}

	public java.util.List<com.cross.CustomAttribute> getCustomAttributes() {
		return this.customAttributes;
	}

	public void setCustomAttributes(
			java.util.List<com.cross.CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	public AddressItem(java.lang.String crossId, java.lang.String geometry,
			java.lang.Boolean valid, com.cross.ResourceRef countryRef,
			java.util.List<com.cross.ExternalId> externalIds,
			java.util.List<com.cross.CustomAttribute> customAttributes) {
		this.crossId = crossId;
		this.geometry = geometry;
		this.valid = valid;
		this.countryRef = countryRef;
		this.externalIds = externalIds;
		this.customAttributes = customAttributes;
	}

}