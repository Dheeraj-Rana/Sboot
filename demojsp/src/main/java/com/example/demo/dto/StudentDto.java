package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class StudentDto {
	@Id
	private int id;
	@Column(nullable = false)
	private String StudentName;
	@Column(nullable = false)
	private String emailId;
	private String coursename;
	
	@OneToOne
	private CourseDto courseDto;
	
	
	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CourseDto getCourseDto() {
		return courseDto;
	}

	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", StudentName=" + StudentName + ", emailId=" + emailId + ", coursename="
				+ coursename + "]";
	}
	
	
}
