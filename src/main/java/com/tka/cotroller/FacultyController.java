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


import com.tka.entity.Faculty;
import com.tka.service.FacultyService;

@RestController
public class FacultyController {
	@Autowired
	FacultyService service;
	
	@GetMapping("/getAllFaculty")
	public List<Faculty> getAllFaculty()
	{
		return service.getAllFaculty();
	}
	@GetMapping("/getFacultyById/{id}")
	public Faculty getFacultyById(@PathVariable int id)
	{
		return service.getFacultyById(id);
	}
	@PostMapping("/createNewFaculty")
	public String createNewFaculty(@RequestBody Faculty obj)
	{
		return service.createNewFaculty(obj);
	}
	@PutMapping("/updateExistingFaculty")
	public String updateExistingFaculty(@RequestBody Faculty obj)
	{
		return service.updateExistingFaculty(obj);
	}
	@DeleteMapping("/deleteExistingFacultyById/{id}")
	public String deleteExistingFacultyById(@PathVariable int id)
	{
		return service.deleteExistingFacultyById(id);
	}
	
	
	

}
