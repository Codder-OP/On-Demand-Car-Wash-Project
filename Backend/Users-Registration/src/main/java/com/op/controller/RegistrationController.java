package com.op.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.VO.ResponseTemplateVO;
import com.op.model.Users;
import com.op.service.RegistrationService;
import com.op.service.SequenceGeneratorService;

@RestController
@RequestMapping("/users")
public class RegistrationController{
	
	@Autowired
	private RegistrationService service;
	@Autowired
	private SequenceGeneratorService service1;
	
	@PostMapping("/registration")
	@CrossOrigin(origins="http://localhost:4200")
	public Users registerUser(@RequestBody Users user) throws Exception {
		String tempEmail=user.getEmailId();
		int tempRole=user.getRole();
		if(tempEmail != null && !"".equals(tempEmail)) {
			Users userObj=service.fetchUserByEmail(tempEmail);
			if(userObj != null) {
				throw new Exception("User with "+ tempEmail+ "is already exists!");
			}
			
		}
		if(tempRole==1) {
			Users userObj=service.fetchUserByRole(tempRole);
			if(userObj != null) {
				throw new Exception("Only one admin allowed!");
			}
		}
		user.setId(service1.getSequenceNumber(Users.SEQUENCE_NAME));
		Users userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public Users loginUser(@RequestBody Users user) throws Exception {
		String tempEmail=user.getEmailId();
		String tempPassword=user.getPassword();
		Users userObj=null;
		if(tempEmail != null && tempPassword != null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmail, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Invalid Email or Password!");
		}
		return userObj;
	}
	@GetMapping("/{id}")
    public ResponseTemplateVO getUserWithOrder(@PathVariable("id") int Id) {
        //log.info("Inside getUserWithDepartment of UserController");
        return service.getUserWithOrders(Id);
	}
	
}