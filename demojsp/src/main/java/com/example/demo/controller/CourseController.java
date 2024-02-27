package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.CourseDto;
import com.example.demo.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/chtml")
	public String courseHtml() {
		return "chtml.html";
	}
	@PostMapping("/ci")
	@ResponseBody
	public String insertCourse(@ModelAttribute CourseDto courseDto) {
		//TODO: process POST request
		
		return courseService.insertCourse(courseDto);
	}
	
	

}
