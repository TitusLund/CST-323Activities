package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.entities.OrderEntity;
import com.gcu.models.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface {
	@Autowired
	private OrderDataService service;
	@Override
	public void test() {
		System.out.println("Hello from the orders business service");
	}
	
	public List<OrderModel> getOrders(){
		List<OrderEntity> ordersEntity = service.findAll();
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(),entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		
		return ordersDomain;
	}
	
	public void init() {
		System.out.println("In OrdersBusinessService Init.");
	}
	public void destroy() {
		System.out.println("In OrdersBusinessService Destroy.");
	}
}
