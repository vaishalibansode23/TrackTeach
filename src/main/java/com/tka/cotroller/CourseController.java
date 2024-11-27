package com.tka.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tka.entity.Course;

import com.tka.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService impl;
	
	
	@GetMapping("/getAllCourse")
	public List<Course> getAllCourse()
	{
		return impl.getAllCourse();
	}
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable int id)
	{
		return impl.getCourseById(id);
	}
	
	@PostMapping("/createNewCourse")
	public String createNewCourse(@RequestBody Course obj)
	{
		return impl.createNewCourse(obj);
	}
	@PutMapping("/updateExistingCourseById/{id}")
	public String updateExistingCourseById(@RequestBody Course c,@PathVariable int id)
	{
		return impl.updateExistingCourseById(c,id);
	}
	@DeleteMapping("/deleteCourseById/{Id}")
	public String deleteCourseById(@PathVariable int id) 
	{
		return impl.deleteCourseById(id);
	}

}
