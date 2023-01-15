package com.mimaraslan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */


@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("index")
	public String index() {
		return "index";
	}
}