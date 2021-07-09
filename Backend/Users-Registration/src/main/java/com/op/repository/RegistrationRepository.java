package com.op.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.op.model.Users;

public interface RegistrationRepository extends MongoRepository<Users, Integer> {
	public Users findByEmailId(String emailId);
	public Users findByRole(int role);
	public Users findByEmailIdAndPassword(String emailId, String Password);
	public Users findById(int Id);

}
