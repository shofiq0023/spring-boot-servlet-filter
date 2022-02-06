package com.filter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filter.model.Student;
import com.filter.service.FilterService;

@RestController
public class FilterController {
	@Autowired
	private FilterService service;
	
	@GetMapping("/get/all")
	public List<Student> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/error")
	public Map<String, String> getError() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "api key didn't match");
		return map;
	}
	
	@GetMapping("/keyError")
	public Map<String, String> getEmptyKey() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "No key provided");
		return map;
	}
}
