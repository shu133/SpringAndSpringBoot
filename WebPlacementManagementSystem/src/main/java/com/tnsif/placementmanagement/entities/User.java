package com.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private Integer userid;
	private String username;
	private String usertype;
	private String userpassword;
	
	//super class constructor
	public User() {
		System.out.println("User class");
	}

	//parameterized constructor
	public User(Integer userid, String username, String usertype, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.usertype = usertype;
		this.userpassword = userpassword;
	}

	//getters and setters
	public long getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	//to string
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", usertype=" + usertype + ", userpassword="
				+ userpassword + "]";
	}

}
