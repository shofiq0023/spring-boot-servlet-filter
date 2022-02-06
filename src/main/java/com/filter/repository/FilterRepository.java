package com.filter.repository;

import org.springframework.data.repository.CrudRepository;

import com.filter.model.Student;

public interface FilterRepository extends CrudRepository<Student, Long> {

}
