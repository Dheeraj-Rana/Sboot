package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/xhtml")
	public String studentHtml() {
		return "xhtml.html";
	}
	
	@PostMapping("/si")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto studentDto) {
		//TODO: process POST request
		String cn=studentDto.getCoursename();	
		CourseDto courseDto = courseService.fetchCourse(cn);
		studentDto.setCourseDto(courseDto);
		return studentService.insertStudent(studentDto);
		//String cn=studentDto.getCoursename();	
		
		}
	
	@GetMapping("/fsid")
	public String fetchStudentById(@RequestParam int id,ModelMap map) {
		StudentDto dto = studentService.fetchStudentById(id);
		map.put("object", dto);
		return "fetchbyid.html";
	}
	@GetMapping("/fsall")
	public String fetchAll(ModelMap map) {
		List<StudentDto>  list= studentService.fetchAll();
		map.put("objects", list);
		return "fetchall.html";
	}
	
	@GetMapping("/deletestudentId")
	@ResponseBody
	public String deleteById(@RequestParam int id) {
		return studentService.deleteById(id);
	}
	
	@GetMapping("/deleteallstudent")
	@ResponseBody
	public String deleteAll() {
		return studentService.deleteAll();
	}

}
