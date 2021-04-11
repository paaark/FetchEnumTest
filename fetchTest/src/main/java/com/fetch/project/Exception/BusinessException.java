package com.fetch.project.Exception;

import com.fetch.project.Enum.ErrorCodeStatus;

import lombok.Getter;

public class BusinessException extends RuntimeException{
	
	@Getter
	private ErrorCodeStatus errorCodeStatus;
	
	public BusinessException(ErrorCodeStatus code) {
		this.errorCodeStatus = code;
	}
	

}
