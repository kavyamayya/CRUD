package com.kavya.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kavya.dto.Request;
import com.kavya.dto.Response;
import com.kavya.models.Users;
import com.kavya.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Response createUser(Request request) {
		Response response = new Response();
		try {
			userRepository.save(request.getUsers());
			response.setStatus("SUCCESS");
		} catch (Exception exception) {
			response.setStatus("FAILURE");
			response.setErrorCode("ERR0002");
			response.setErrorMessage("Error in creating user");
		}
		return response;
	}

	@Override
	public Response updateUser(Request request) {
		Response response = new Response();
		try {
			Optional<Users> user = userRepository.findById(request.getUsers().getId());
			if (user.isPresent()) {
				user.get().setEmail(request.getUsers().getEmail());
				user.get().setPhone(request.getUsers().getPhone());
				user.get().setName(request.getUsers().getName());
				userRepository.save(user.get());
				response.setStatus("SUCCESS");
			}else{
				response.setStatus("FAILURE");
				response.setErrorCode("ERR0004");
				response.setErrorMessage("User does not exist.");
			}
		} catch (Exception e) {
			response.setStatus("FAILURE");
			response.setErrorCode("ERR0003");
			response.setErrorMessage("Error in updating user");
		}
		return response;
	}

	@Override
	public Response getUser(Integer userId) {
		Response response = new Response();
		try {
			Optional<Users> user = userRepository.findById(userId);
			if (user.isPresent()) {
				response.setUsers(user.get());
				response.setStatus("SUCCESS");
			} else {
				response.setStatus("FAILURE");
				response.setErrorCode("ERR0004");
				response.setErrorMessage("User does not exist.");
			}
		} catch (Exception e) {
			response.setStatus("FAILURE");
			response.setErrorCode("ERR0004");
			response.setErrorMessage("Error in getting user.");
		}
		return response;
	}

	@Override
	public Response deleteUser(Integer userId) {
		Response response = new Response();
		try {
			userRepository.deleteById(userId);
			response.setStatus("SUCCESS");
		} catch (Exception exception) {
			response.setStatus("FAILURE");
			response.setErrorCode("ERR0001");
			response.setErrorMessage("Error in deleting user");
		}
		return response;
	}

}
