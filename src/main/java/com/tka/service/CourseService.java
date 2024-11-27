package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tka.entity.Course;

@Service
public interface CourseService {
	List<Course> getAllCourse();
	
	Course getCourseById(int id);
	
	String createNewCourse(Course obj);

	String updateExistingCourseById(Course c,int id);

	String deleteCourseById(int id);

}
