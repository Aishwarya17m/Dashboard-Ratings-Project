package com.lti.movierating.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	
	private String userName;
	
	private String userEmail;
	
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	
	}

	public User(int userId, String userName, String userEmail, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
	}



	public User(int userId) {
		super();
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", password="
				+ password + "]";
	}
	
	
}
