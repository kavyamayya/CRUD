package com.kavya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kavya.dto.Request;
import com.kavya.dto.Response;
import com.kavya.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/createUser")
	public Response createUser(@RequestBody Request request) {
		return userService.createUser(request);
	}

	@PutMapping(value = "/updateUser")
	public Response updateUser(@RequestBody Request request) {
		return userService.updateUser(request);
	}
	
	@GetMapping(value="/getUser")
	public Response getUser(@RequestParam Integer userId){
		return userService.getUser(userId);
	}
	
	@DeleteMapping(value="/deleteUser")
	public Response deleteUser(@RequestParam Integer userId){
		return userService.deleteUser(userId);
	}
}
