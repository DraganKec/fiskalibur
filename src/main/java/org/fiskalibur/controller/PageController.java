package org.fiskalibur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
}
