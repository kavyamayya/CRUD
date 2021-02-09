package com.kavya.service;

import com.kavya.dto.Request;
import com.kavya.dto.Response;

public interface UserService {

	Response createUser(Request request);

	Response updateUser(Request request);

	Response getUser(Integer userId);

	Response deleteUser(Integer userId);

}
