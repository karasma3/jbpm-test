package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IPAddressGetBody implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String entity;
	private java.lang.String entityFilterExpression;
	private java.lang.Integer limit;
	private java.lang.Integer offset;
	private java.lang.Boolean returnTotalCount;
	private java.lang.Integer noOfSelectedAttributes;
	private java.util.List<com.cross.SelectQuery> select;

	public IPAddressGetBody() {
	}

	public java.lang.String getEntity() {
		return this.entity;
	}

	public void setEntity(java.lang.String entity) {
		this.entity = entity;
	}

	public java.lang.String getEntityFilterExpression() {
		return this.entityFilterExpression;
	}

	public void setEntityFilterExpression(
			java.lang.String entityFilterExpression) {
		this.entityFilterExpression = entityFilterExpression;
	}

	public java.lang.Integer getLimit() {
		return this.limit;
	}

	public void setLimit(java.lang.Integer limit) {
		this.limit = limit;
	}

	public java.lang.Integer getOffset() {
		return this.offset;
	}

	public void setOffset(java.lang.Integer offset) {
		this.offset = offset;
	}

	public java.lang.Boolean getReturnTotalCount() {
		return this.returnTotalCount;
	}

	public void setReturnTotalCount(java.lang.Boolean returnTotalCount) {
		this.returnTotalCount = returnTotalCount;
	}

	public java.lang.Integer getNoOfSelectedAttributes() {
		return this.noOfSelectedAttributes;
	}

	public void setNoOfSelectedAttributes(
			java.lang.Integer noOfSelectedAttributes) {
		this.noOfSelectedAttributes = noOfSelectedAttributes;
	}

	public java.util.List<com.cross.SelectQuery> getSelect() {
		return this.select;
	}

	public void setSelect(java.util.List<com.cross.SelectQuery> select) {
		this.select = select;
	}

	public IPAddressGetBody(java.lang.String entity,
			java.lang.String entityFilterExpression, java.lang.Integer limit,
			java.lang.Integer offset, java.lang.Boolean returnTotalCount,
			java.lang.Integer noOfSelectedAttributes,
			java.util.List<com.cross.SelectQuery> select) {
		this.entity = entity;
		this.entityFilterExpression = entityFilterExpression;
		this.limit = limit;
		this.offset = offset;
		this.returnTotalCount = returnTotalCount;
		this.noOfSelectedAttributes = noOfSelectedAttributes;
		this.select = select;
	}

}