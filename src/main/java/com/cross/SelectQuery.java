package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SelectQuery implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String relationName;
	private java.lang.String attributeName;

	public SelectQuery() {
	}

	public java.lang.String getRelationName() {
		return this.relationName;
	}

	public void setRelationName(java.lang.String relationName) {
		this.relationName = relationName;
	}

	public java.lang.String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(java.lang.String attributeName) {
		this.attributeName = attributeName;
	}

	public SelectQuery(java.lang.String relationName,
			java.lang.String attributeName) {
		this.relationName = relationName;
		this.attributeName = attributeName;
	}

}