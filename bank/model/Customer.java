package com.revature.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Customer {

1) Customer (id/name/email/dob/mobile/address/password)

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;	

	@Column(name="dob")
	private String dob;
	
	@Column(name = "email_id")
	private String emailId;

	@Column(name="mobile")
	private long mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="password")
	private String password;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, String dob, String mobile, String address, String password) {
		super();
		this.name = name;
		this.email=email;
		this.dob = dob;
		this.mobile=mobile;
		this.address=address;
		this.password=password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}public String getMobile() {
		return mobile;
	}
	public void SetMobile(String mobile) {
		this.mobile = mobile;
	}public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}