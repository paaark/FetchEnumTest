package com.fetch.project.Enum;

import lombok.Getter;

@Getter
public enum ErrorCodeStatus {
	
	RESOURCE_NOT_FOUND(400, "C001001", "해당 리소스를 찾을 수 없습니다"),
	INCLUDE_NUMBER(400, "D100100", "숫자가 포함되어있습니다.");
	
	
	private int status;
	
	private String code;
	
	private String message;
	
	public int getStatus() {
		return this.status;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	ErrorCodeStatus(int status, String code,String message){
		this.status = status;
		this.code = code;
		this.message = message;
	}

}
