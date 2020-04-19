package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.HomeService;

@Controller
public class HomeController {

	private final HomeService homeService;

	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}

	@GetMapping(value = "/")
	public String home() {
		return "index.html";
	}

	@GetMapping(value = "/client")
	public String client() {
		 List<String> userNames = homeService.getData();
		 System.out.println(userNames);
		return "my_client.html";
	}

}
