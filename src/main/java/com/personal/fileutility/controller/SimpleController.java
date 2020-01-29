package com.personal.fileutility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class SimpleController {
	@RequestMapping("/")
	@ResponseBody
	String helloWorld() {
		return "Hello, world!";
	}
}
