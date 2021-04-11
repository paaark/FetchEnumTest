package com.fetch.project;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fetch.project.DTO.DefDTO;
import com.fetch.project.DTO.MessageDTO;
import com.fetch.project.Service.DefService;

@RestController
public class DefController {
	
	@Autowired
	private DefService DefService;
	
	@PostMapping(value="/isDef")
	public ResponseEntity<?> isDef(@Valid @RequestBody DefDTO DefDTO){
		System.out.println("DefDTO : "+DefDTO.getDefCheckValue());
		return DefService.checkDefValue(DefDTO);
		
	}

}
