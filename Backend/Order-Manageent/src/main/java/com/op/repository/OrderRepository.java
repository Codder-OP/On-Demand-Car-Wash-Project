package com.op.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.op.model.Orders;


public interface OrderRepository extends MongoRepository<Orders, Integer> {

	public List<Orders> findByCid(int cid);

	public List<Orders> findByOid(int oid);

}
