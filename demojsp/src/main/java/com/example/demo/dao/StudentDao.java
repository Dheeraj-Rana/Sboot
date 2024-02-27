package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudentDto;
import com.example.demo.repository.StudentRepo;

@Component
public class StudentDao {
	@Autowired
	StudentRepo studentRepo;
	
	public String insertStudent(StudentDto studentDto) {
		studentRepo.save(studentDto);
		return "inserted successfully";
	}
	public Optional<StudentDto> fetchStudentById(int id){
		return studentRepo.findById(id);
	}
	public List<StudentDto> fetchAll(){
		List<StudentDto> list = studentRepo.findAll();
		return list;
	}
	public String deleteById(int id) {
		studentRepo.deleteById(id);
		return "deleted successfully";
	}
	
	public String deleteAll() {
		studentRepo.deleteAll();
		return "delete all data successfully";
	}

}
