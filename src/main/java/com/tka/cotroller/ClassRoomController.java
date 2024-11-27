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

import com.tka.entity.Classroom;
import com.tka.service.ClassRoomService;

@RestController
public class ClassRoomController {
	@Autowired
	ClassRoomService impl;
	
	
	@GetMapping("/getAllClassrooms")
	public List<Classroom> getAllClassrooms()
	{
		return impl.getAllClassrooms();
	}
	@GetMapping("/getClassroomById/{id}")
	public Classroom getClassroomById(@PathVariable int id)
	{
		return impl.getClassroomById(id);
	}
	
	@PostMapping("/createNewClassroom")
	public String createNewClassroom(@RequestBody Classroom obj)
	{
		return impl.createNewClassroom(obj);
	}
	@PutMapping("/updateExistingClassroomById/{id}")
	public String updateExistingClassroomById(@RequestBody Classroom c,@PathVariable int id)
	{
		return impl.updateExistingClassroomById(c,id);
	}
	@DeleteMapping("/deleteClassroomById/{Id}")
	public String deleteClassroomById(@PathVariable int id) 
	{
		return impl.deleteClassroomById(id);
	}

}
