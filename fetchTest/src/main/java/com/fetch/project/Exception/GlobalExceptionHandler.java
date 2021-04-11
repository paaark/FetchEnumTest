package com.fetch.project.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import com.fetch.project.Enum.ErrorCodeStatus;
import com.fetch.project.Resonpnse.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> GlobalBusinessException(BusinessException e) {
      	ErrorCodeStatus errorCode = e.getErrorCodeStatus();
      	ErrorResponse response = ErrorResponse.of(e.getErrorCodeStatus());
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.valueOf(errorCode.getStatus()));
    }

}
