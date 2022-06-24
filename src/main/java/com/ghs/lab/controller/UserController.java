package com.ghs.lab.controller;

import com.ghs.lab.response.UserResponse;
import com.ghs.lab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value="/getAll")
	public UserResponse getAllUsers() {

		return this.userService.getUserList();
	}


}
