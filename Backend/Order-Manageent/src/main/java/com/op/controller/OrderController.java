package com.op.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.model.Orders;
import com.op.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/place")
	public String placeOrder(@RequestBody Orders order) throws Exception{
		service.saveOrder(order);
		return "Your Order with Order ID "+ order.getOid()+" has been placed! ";
		
	}
	
	@GetMapping("/viewOrder/{cid}")
	public List<Orders> viewOrders( @PathVariable int cid) throws Exception{
		// int tempCid=order.getCid();
		List<Orders> orderObj=service.fetchOrderByCid(cid);
		if(orderObj==null) {
			throw new Exception("No Orders! Please place an order.");
		}
		return orderObj;	
	}
	@GetMapping("/viewOrderByOid/{oid}")
	public List<Orders> viewOrdersByOid( @PathVariable int oid) throws Exception{
		// int tempCid=order.getCid();
		List<Orders> orderObj=service.fetchOrderByOid(oid);
		if(orderObj==null) {
			throw new Exception("No Orders! Please place an order.");
		}
		return orderObj;	
	}
	
	@GetMapping("/ViewAll")
	public List<Orders> ViewAllOrders() throws Exception{
		/*if(order.getCid()!=1) {
			throw new Exception("Access Denied!");
			
		}*/
		List<Orders> orderObj=service.findAll();
		return orderObj;
	}
	
	@DeleteMapping("/delete/{oid}")
	public String deleteOrder(@RequestBody Orders order, @PathVariable int oid) {
		
		service.deleteByOid(oid);
		return "Order deleted with id: "+oid;
	}
	

}
