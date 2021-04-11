package com.fetch.project.Resonpnse;

import com.fetch.project.Enum.ErrorCodeStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {
	
	private String message;
	private int status;
	private String code;
	
	public ErrorResponse(ErrorCodeStatus code) {
		this.status = code.getStatus();
		this.code = code.getCode();
		this.message = code.getMessage();
	}

	public static ErrorResponse of(ErrorCodeStatus errorCode) {
		// TODO Auto-generated method stub
		return new ErrorResponse(errorCode);
	}
	
}
