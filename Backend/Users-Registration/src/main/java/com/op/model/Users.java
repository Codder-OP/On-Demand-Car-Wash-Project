package com.op.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Document(collection="Users")
public class Users {
	@Transient
	public static final String SEQUENCE_NAME="user_sequence";
	@Id
	//@GeneratedValue(strategy=generationType.IDENTITY)
	private int id;
	private int role;
	private String emailId;
	private String name;
	private String password;
	private String contact;
	private String address;
	
	public Users() {
		
	}
	
	public Users(int id, int role, String emailId, String name, String password, String contact, String address) {
		super();
		this.id = id;
		this.role = role;
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
