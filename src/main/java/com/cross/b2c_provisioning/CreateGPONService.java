package com.cross.b2c_provisioning;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreateGPONService implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "_meta_externalIdsImplicitRemove")
	private java.lang.Boolean _meta_externalIdsImplicitRemove;
	@org.kie.api.definition.type.Label(value = "crossId")
	private java.lang.String crossId;
	@org.kie.api.definition.type.Label(value = "ethName")
	private java.lang.String ethName;
	@org.kie.api.definition.type.Label(value = "ponLinkName")
	private java.lang.String ponLinkName;
	@org.kie.api.definition.type.Label(value = "ponPathName")
	private java.lang.String ponPathName;
	@org.kie.api.definition.type.Label(value = "scpCrossId")
	private java.lang.String scpCrossId;
	@org.kie.api.definition.type.Label(value = "serviceLinks")
	private java.util.List<com.cross.b2c_provisioning.GPONServiceLink> serviceLinks;
	@org.kie.api.definition.type.Label(value = "statusDiscriminator")
	private java.lang.String statusDiscriminator;

	public CreateGPONService() {
	}

	public java.lang.Boolean get_meta_externalIdsImplicitRemove() {
		return this._meta_externalIdsImplicitRemove;
	}

	public void set_meta_externalIdsImplicitRemove(
			java.lang.Boolean _meta_externalIdsImplicitRemove) {
		this._meta_externalIdsImplicitRemove = _meta_externalIdsImplicitRemove;
	}

	public java.lang.String getCrossId() {
		return this.crossId;
	}

	public void setCrossId(java.lang.String crossId) {
		this.crossId = crossId;
	}

	public java.lang.String getEthName() {
		return this.ethName;
	}

	public void setEthName(java.lang.String ethName) {
		this.ethName = ethName;
	}

	public java.lang.String getPonLinkName() {
		return this.ponLinkName;
	}

	public void setPonLinkName(java.lang.String ponLinkName) {
		this.ponLinkName = ponLinkName;
	}

	public java.lang.String getPonPathName() {
		return this.ponPathName;
	}

	public void setPonPathName(java.lang.String ponPathName) {
		this.ponPathName = ponPathName;
	}

	public java.lang.String getScpCrossId() {
		return this.scpCrossId;
	}

	public void setScpCrossId(java.lang.String scpCrossId) {
		this.scpCrossId = scpCrossId;
	}

	public java.util.List<com.cross.b2c_provisioning.GPONServiceLink> getServiceLinks() {
		return this.serviceLinks;
	}

	public void setServiceLinks(
			java.util.List<com.cross.b2c_provisioning.GPONServiceLink> serviceLinks) {
		this.serviceLinks = serviceLinks;
	}

	public java.lang.String getStatusDiscriminator() {
		return this.statusDiscriminator;
	}

	public void setStatusDiscriminator(java.lang.String statusDiscriminator) {
		this.statusDiscriminator = statusDiscriminator;
	}

	public CreateGPONService(
			java.lang.Boolean _meta_externalIdsImplicitRemove,
			java.lang.String crossId,
			java.lang.String ethName,
			java.lang.String ponLinkName,
			java.lang.String ponPathName,
			java.lang.String scpCrossId,
			java.util.List<com.cross.b2c_provisioning.GPONServiceLink> serviceLinks,
			java.lang.String statusDiscriminator) {
		this._meta_externalIdsImplicitRemove = _meta_externalIdsImplicitRemove;
		this.crossId = crossId;
		this.ethName = ethName;
		this.ponLinkName = ponLinkName;
		this.ponPathName = ponPathName;
		this.scpCrossId = scpCrossId;
		this.serviceLinks = serviceLinks;
		this.statusDiscriminator = statusDiscriminator;
	}

}