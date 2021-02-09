package com.kavya.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kavya.models.Users;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

	private String errorMessage;
	private String errorCode;
	private String status;
	private Users users;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
