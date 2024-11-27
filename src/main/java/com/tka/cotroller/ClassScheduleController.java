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

import com.tka.entity.ClassSchedule;
import com.tka.service.ClassScheduleService;

@RestController
public class ClassScheduleController {
	@Autowired
	ClassScheduleService service;
	
	@GetMapping("/getAllClassSchedul")
	public List<ClassSchedule> getAllClassSchedul()
	{
		return service.getAllClassSchedul();
	}
	@GetMapping("/getClassScheduleById/{id}")
	public ClassSchedule getClassScheduleById(@PathVariable int id)
	{
		return service.getClassScheduleById(id);
	}
	@PostMapping("/createNewClassSchedule")
	public String createNewClassSchedule(@RequestBody ClassSchedule obj)
	{
		return service.createNewClassSchedule(obj);
	}
	@PutMapping("/updateExistingClassSchedule")
	public String updateExistingClassSchedule(@RequestBody ClassSchedule obj)
	{
		return service.updateExistingClassSchedule(obj);
	}
	@DeleteMapping("/deleteExistingClassScheduleById/{id}")
	public String deleteExistingClassScheduleById(@PathVariable int id)
	{
		return service.deleteExistingClassScheduleById(id);
	}
	
	
	

}
