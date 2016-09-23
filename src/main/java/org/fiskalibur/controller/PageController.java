package org.fiskalibur.controller;

import org.fiskalibur.servis.KomitentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {


	KomitentService komitentService;

	@RequestMapping("/test")
	public String Index() {
		return "index";
	}
}
