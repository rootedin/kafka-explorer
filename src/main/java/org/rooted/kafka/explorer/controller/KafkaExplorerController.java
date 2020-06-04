package org.rooted.kafka.explorer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KafkaExplorerController {

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

}
