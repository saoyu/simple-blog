package com.shaoyu.simple_blog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagshowController {
	@GetMapping("/tags/{id}")
	public String tags(
			@PathVariable Long id) {
		return null;
	}
}
