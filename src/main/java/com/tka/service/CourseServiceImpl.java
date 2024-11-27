package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tka.dao.CourseDao;
import com.tka.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseDao daoImpl; 
	public List<Course> getAllCourse()
	{
		return daoImpl.getAllCourse();
	}
	public Course getCourseById(int id)
	{
		return daoImpl.getCourseById(id);
	}
	public String createNewCourse(Course obj) {
		return daoImpl.createNewCourse(obj);
	}
	@Override
	public String updateExistingCourseById(Course c,int id) {
		return daoImpl.updateExistingCourseById(c,id);
	}
	@Override
	public String deleteCourseById(int id) {
		return daoImpl.deleteCourseById(id);
	}

}
