package com.fetch.project.Service;

import org.springframework.http.ResponseEntity;

import com.fetch.project.DTO.DefDTO;
import com.fetch.project.DTO.MessageDTO;

public interface DefService {
	
	public ResponseEntity<MessageDTO> checkDefValue(DefDTO DefDTO);
//	public ResponseEntity<MessageDTO> checkDefValue(String defCheckValue);

}
