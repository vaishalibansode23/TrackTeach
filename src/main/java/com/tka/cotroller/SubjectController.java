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



import com.tka.entity.Subject;

import com.tka.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	SubjectService service;
	
	@GetMapping("/getAllSubject")
	public List<Subject> getAllSubject()
	{
		return service.getAllSubject();
	}
	@GetMapping("/getSubjectById/{id}")
	public Subject getSubjectById(@PathVariable int id)
	{
		return service.getSubjectById(id);
	}
	@PostMapping("/createNewSubject")
	public String createNewSubject(@RequestBody Subject obj)
	{
		return service.createNewSubject(obj);
	}
	@PutMapping("/updateExistingSubject")
	public String updateExistingSubject(@RequestBody Subject obj)
	{
		return service.updateExistingSubject(obj);
	}
	@DeleteMapping("/deleteExistingSubjectById/{id}")
	public String deleteExistingSubjectById(@PathVariable int id)
	{
		return service.deleteExistingSubjectById(id);
	}
	
	
	

}
