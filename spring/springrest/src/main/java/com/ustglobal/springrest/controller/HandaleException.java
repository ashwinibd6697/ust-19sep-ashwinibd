package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.bean.EmployeeResponse;
@RestControllerAdvice
public class HandaleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
	   EmployeeResponse response = new EmployeeResponse();
	   response.setStatusCode(501);
	   response.setMessage("Error in Code");
	   response.setDescription("Got an Exception");
      return response;
      
   }
}
