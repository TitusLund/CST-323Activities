package com.gcu.business;

import java.util.List;

import com.gcu.models.OrderModel;

public interface OrdersBusinessInterface {
	public void test();
	public List<OrderModel> getOrders();
	
	public void init();
	public void destroy();
}
