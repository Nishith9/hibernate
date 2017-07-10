package org.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
/**@Entity (name="USER_DATA") creates a table with name USER_DATA instead of 
classname UserData  **/
public class UserData {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	
	address address = new address();
	
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
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
	
}
