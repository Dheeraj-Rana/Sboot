package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.StudentDto;

@Repository
public interface StudentRepo extends JpaRepository<StudentDto, Integer>{

}
