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


import com.tka.entity.Department;
import com.tka.service.DepartmentService;

@RestController
public class DepartmentCotroller {
	@Autowired
	DepartmentService impl;
	@GetMapping("/getAllDepartment")
	public List<Department> gelAllDepartment()
	{
		return impl.gelAllDepartment();
	}
	@GetMapping("/getDepartmentById/{id}")
	public Department getDepartmentById(@PathVariable int id)
	{
		return impl.getDepartmentById(id);
	}
	@PostMapping("/createNewDepartment")
	public String createNewDepartment(@RequestBody Department d)
	{
		return impl.createNewDepartment(d);
	}
	@PutMapping("/updateExistingDepartmentById/{id}")
	public String updateExistingDepartmentById(@RequestBody Department c,@PathVariable int id)
	{
		return impl.updateExistingDepartmentById(c,id);
	} 
	@DeleteMapping("/deleteDepartmentById/{id}")
	public String deleteDepartmentById(@PathVariable int id)
	{	
		return impl.deleteDepartmentById(id);
		
	}

}
