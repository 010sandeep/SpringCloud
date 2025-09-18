package com.rays.service02.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "User")
public class UserCtl {

	@GetMapping
	public String dispaly() {
		
		return "in dispaly mehtod";
	}
	
}
