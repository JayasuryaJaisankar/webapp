package com.webapp.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/maven1")
	public String word() {
		return "noLie";
	}

}
