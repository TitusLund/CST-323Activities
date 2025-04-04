package com.gcu.data.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.gcu.entities.OrderEntity;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long>{
	@Override
	@Query(value = "SELECT * FROM orders")
	public List<OrderEntity> findAll();
}
