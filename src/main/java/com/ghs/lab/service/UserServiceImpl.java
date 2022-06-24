package com.ghs.lab.service;

import com.ghs.lab.entities.User;
import com.ghs.lab.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public UserResponse getUserList() {
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setFullName("Parnik");
		user.setAddress("Hyderabad");
		user.setEmailId("parnik1989@gmail.com");
		user.setPhoneNumber("9000220765");
		userList.add(user);
		UserResponse response = new UserResponse();
		response.setUserList(userList);
		return response;
	}

}
