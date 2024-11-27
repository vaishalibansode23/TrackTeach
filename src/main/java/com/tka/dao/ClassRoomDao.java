package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public interface ClassRoomDao {
	List<Classroom> getAllClassrooms();
	
	String createNewClassroom(Classroom obj) ;
	
	Classroom getClassroomById(int id);

	String updateExistingClassroomById(Classroom c,int id);

	String deleteClassroomById(int id);

}
