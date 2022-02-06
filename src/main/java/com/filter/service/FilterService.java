package com.filter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filter.model.Student;
import com.filter.repository.FilterRepository;

@Service
public class FilterService {
	@Autowired
	private FilterRepository repo;
	
	public List<Student> getAll() {
		List<Student> students = new ArrayList<>();
		repo.findAll().forEach(students::add);
		return students;
	}
}
