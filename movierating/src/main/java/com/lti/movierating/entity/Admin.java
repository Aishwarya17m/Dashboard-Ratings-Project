package com.lti.movierating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private int adminId;
	
	private String adminEmail;
	
	private String adminPassword;

	public int getId() {
		return adminId;
	}

	public void setId(int id) {
		this.adminId = id;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [id=" + adminId + ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword + "]";
	}
	
	public Admin() {
		
	}

	public Admin(int id, String adminEmail, String adminPassword) {
		super();
		this.adminId = id;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	
	
}
