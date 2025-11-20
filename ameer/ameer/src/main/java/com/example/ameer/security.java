package com.example.ameer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping 

public class security{
	@GetMapping("/hii")
	public String sayhii() {
		return "successfull";
	}

	

}

