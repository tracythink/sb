package com.sb.hyh.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	public static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@RequestParam String key, @RequestParam String value) {
		System.out.println(key);
		System.out.println(value);
		System.out.println("index");
		return "index";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(@RequestParam String password) {
		System.out.println(password);
		return "index";
	}
}
