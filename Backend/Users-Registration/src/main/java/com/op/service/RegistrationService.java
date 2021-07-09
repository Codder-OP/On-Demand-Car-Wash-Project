package com.op.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.op.VO.Orders;
import com.op.VO.ResponseTemplateVO;
import com.op.model.Users;
import com.op.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository repo;
	
	@Autowired
    private RestTemplate restTemplate;
	
	public Users saveUser(Users user) {
		return repo.save(user);	
	}
	
	public Users fetchUserByEmail(String email) {
		return repo.findByEmailId(email);
	}
	
	public Users fetchUserByRole(int role) {
		return repo.findByRole(role);
	}

	public Users fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}

	public ResponseTemplateVO getUserWithOrders(int userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
        Users user = repo.findById(userId);
        Orders order=
        		 restTemplate.getForObject("http://ORDER-SERVICE/orders/" + user.getId()
                 ,Orders.class);
        vo.setUser(user);
        vo.setOrder(order);
        
		return vo;
	}

}
