package com.fetch.project.ServiceImpl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fetch.project.DTO.DefDTO;
import com.fetch.project.DTO.MessageDTO;
import com.fetch.project.Enum.ErrorCodeStatus;
import com.fetch.project.Exception.BusinessException;
import com.fetch.project.Service.DefService;

@Service("DefService")
public class DefServiceImpl implements DefService{
	
	//	public ResponseEntity<MessageDTO> checkDefValue(String defCheckValue){
	//	HttpHeaders headers = new HttpHeaders();
	//	
	//	if(!"DEF".equals(defCheckValue)) {
	//		return new ResponseEntity<MessageDTO>(getMessage("일치하지 않습니다."), headers, HttpStatus.BAD_REQUEST);
	//	} else if("".equals(defCheckValue)) {
	//		return new ResponseEntity<MessageDTO>(getMessage("빈값입니다."), headers, HttpStatus.BAD_REQUEST);
	//	} else if("DEF".equals(defCheckValue)){
	//		return new ResponseEntity<MessageDTO>(getMessage("일치합니다."), headers, HttpStatus.OK);
	//	} else {
	//		return new ResponseEntity<MessageDTO>(getMessage("정보를 확인해주세요."), headers, HttpStatus.BAD_REQUEST);
	//	}
	//
	//}
	
	
	public ResponseEntity<MessageDTO> checkDefValue(DefDTO DefDTO){
		
		return compareValue(DefDTO);
		
	}
	
	private MessageDTO getMessage(String getMessage) {
		MessageDTO message = MessageDTO.builder().message(getMessage).build();
		return message;
	}
	
	private ResponseEntity<MessageDTO> compareValue(DefDTO DefDTO) {
		
		HttpHeaders headers = new HttpHeaders();
		
		if(!"DEF".equals(DefDTO.getDefCheckValue())) {
			return new ResponseEntity<MessageDTO>(getMessage("일치하지 않습니다."), headers, HttpStatus.BAD_REQUEST);
		} else if("".equals(DefDTO.getDefCheckValue())) {
			return new ResponseEntity<MessageDTO>(getMessage("빈값입니다."), headers, HttpStatus.BAD_REQUEST);
		} else if("DEF".equals(DefDTO.getDefCheckValue())){
			return new ResponseEntity<MessageDTO>(getMessage("일치합니다."), headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<MessageDTO>(getMessage("정보를 확인해주세요."), headers, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
