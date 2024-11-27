package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.entity.Classroom;

@Service
public interface ClassRoomService {
	List<Classroom> getAllClassrooms();
	
	Classroom getClassroomById(int id);
	
	String createNewClassroom(Classroom obj);

	String updateExistingClassroomById(Classroom c,int id);

	String deleteClassroomById(int id);

}
