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

	@GetMapping("/addmanifest")
	public String addManifest(Model model) {

		return "pages/manifestform";
	}
	
	
	@GetMapping("/manageuser")
	public String manageUser(Model model) {

		return "pages/manageuser";
	}
	
	@GetMapping("/adduser")
	public String manageUserAdd(Model model) {

		return "pages/manageuserform";
	}
	
	@GetMapping("/manageuseraccess")
	public String manageUserAccess(Model model) {

		return "pages/manageuseraccess";
	}
	
	@GetMapping("/adduseraccess")
	public String manageUserAccessAdd(Model model) {

		return "pages/manageuseraccessform";
	}
}
