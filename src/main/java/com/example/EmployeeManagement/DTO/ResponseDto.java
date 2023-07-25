package com.example.EmployeeManagement.DTO;

public class ResponseDto {

	private int statusCode;
	private boolean success;
	private String message;
	private Object result;

	public ResponseDto(int statusCode, boolean success, String message, Object result) {
		super();
		this.statusCode = statusCode;
		this.success = success;
		this.message = message;
		this.result = result;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
