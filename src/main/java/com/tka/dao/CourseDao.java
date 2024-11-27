package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.tka.entity.Course;

@Repository
public interface CourseDao {
	List<Course> getAllCourse();
	
	String createNewCourse(Course obj) ;
	
	Course getCourseById(int id);

	String updateExistingCourseById(Course c,int id);

	String deleteCourseById(int id);

}
