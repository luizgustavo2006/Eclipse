package com.itb.aviculturasilsan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/avicultura_silsan/v1") // https://localhost:8080/avicultura_silsan/v1/index
public class IndexController {
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}

}