package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AddressGetResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.cross.AddressItem> items;
	private java.lang.Integer totalCount;
	private java.lang.Boolean hasMore;

	public AddressGetResponse() {
	}

	public java.util.List<com.cross.AddressItem> getItems() {
		return this.items;
	}

	public void setItems(java.util.List<com.cross.AddressItem> items) {
		this.items = items;
	}

	public java.lang.Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(java.lang.Integer totalCount) {
		this.totalCount = totalCount;
	}

	public java.lang.Boolean getHasMore() {
		return this.hasMore;
	}

	public void setHasMore(java.lang.Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public AddressGetResponse(java.util.List<com.cross.AddressItem> items,
			java.lang.Integer totalCount, java.lang.Boolean hasMore) {
		this.items = items;
		this.totalCount = totalCount;
		this.hasMore = hasMore;
	}

}