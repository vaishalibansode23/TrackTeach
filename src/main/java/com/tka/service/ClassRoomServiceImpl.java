package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassRoomDao;
import com.tka.entity.Classroom;

@Service
public class ClassRoomServiceImpl implements ClassRoomService{
	@Autowired
	ClassRoomDao daoImpl; 
	public List<Classroom> getAllClassrooms()
	{
		return daoImpl.getAllClassrooms();
	}
	public Classroom getClassroomById(int id)
	{
		return daoImpl.getClassroomById(id);
	}
	public String createNewClassroom(Classroom obj) {
		// TODO Auto-generated method stub
		return daoImpl.createNewClassroom(obj);
	}
	@Override
	public String updateExistingClassroomById(Classroom c,int id) {
		// TODO Auto-generated method stub
		return daoImpl.updateExistingClassroomById(c,id);
	}
	@Override
	public String deleteClassroomById(int id) {
		// TODO Auto-generated method stub
		return daoImpl.deleteClassroomById(id);
	}

}
