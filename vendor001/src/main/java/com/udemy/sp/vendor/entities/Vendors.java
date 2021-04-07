package com.udemy.sp.vendor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendors {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String address;
	private String code;
	private String name;
	private String email;
	private String phone;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vendors [id=" + id + ", address=" + address + ", code=" + code + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", type=" + type + "]";
	}
	public Vendors(int id, String address, String code, String name, String email, String phone, String type) {
		
		this.id = id;
		this.address = address;
		this.code = code;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.type = type;
	}
	public Vendors() {
		
	}
	
	

}
