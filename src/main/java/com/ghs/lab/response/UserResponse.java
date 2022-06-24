package com.ghs.lab.response;

import com.ghs.lab.entities.User;

import java.util.List;

public class UserResponse {

	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
