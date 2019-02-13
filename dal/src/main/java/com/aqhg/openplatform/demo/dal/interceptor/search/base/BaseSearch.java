package com.aqhg.openplatform.demo.dal.interceptor.search.base;

public abstract class BaseSearch {

	// 排序字段
	private String orderBy;

	// 排序方式
	private String order = Order.ASC;

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {

		this.orderBy = orderBy;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {

		if (Order.DESC.equalsIgnoreCase(order) || Order.ASC.equalsIgnoreCase(order)) {
			this.order = order;
		}
	}

	public static class Order {
		private Order() {
		}

		public static final String ASC = "asc";
		public static final String DESC = "desc";
	}
}
