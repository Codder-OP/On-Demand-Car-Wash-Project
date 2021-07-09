package com.op.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.op.model.Orders;
import com.op.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;

	public Orders saveOrder(Orders order) {
		return repo.save(order);	
	}

	public List<Orders> fetchOrderByCid(int Cid) {
		return repo.findByCid(Cid);
		
	}

	public List<Orders> findAll() {
		return repo.findAll();
	}

	public void deleteByOid(int oid) {
		repo.deleteById(oid);
		
	}

	public List<Orders> fetchOrderByOid(int oid) {
		return repo.findByOid(oid);
		
	}

}
