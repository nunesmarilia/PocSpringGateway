package com.b2w.services.fallback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	private static final Logger LOGGER = LoggerFactory.getLogger(FallbackController.class);

	@PostMapping("/testService")
	public String fallback(){
		return "Eita!!! Hello JavaInUse Called in Fallback Service";
	}

}
