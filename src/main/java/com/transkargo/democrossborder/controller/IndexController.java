package com.transkargo.democrossborder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {

		return "login";
	}

	@PostMapping("/login")
	public String login(Model model) {

		return "index";
	}

}
