package com.sandip.ui.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandip.service.UserService;
import com.sandip.ui.model.User;
import com.sandip.ui.model.UserDto;
import com.sandip.ui.model.UserResponse;

@RestController
@RequestMapping("/users")//http://localhost:8080/users <-- URI for which request will be processed
public class UserController{
	
	@Autowired
	UserService userService;
	
	//Get Specific User
	 
	
	//Get all the users
	@GetMapping (produces = "application/json")
	public String getUser() {
		
		List<User> userList = userService.getUsers();
		return null;
	}
	
	//Create User
	@PostMapping( produces = "application/json", consumes = "application/json")
	public UserResponse createUser(@RequestBody User userRequest) {
		
		UserResponse userResponse = new UserResponse();
		UserDto userDto = new UserDto(); 
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDto newUser = userService.createUser(userDto);
		BeanUtils.copyProperties(newUser, userResponse);

		
		return userResponse;
	}
	
	//Update User
	@PutMapping
	public String updateUser() {
		
		return "User is updated";
	}
	
	@DeleteMapping
	public String deleteUser() {
		
		return "User is deleted";
	}
	
	

}
