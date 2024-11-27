package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassScheduleDao;
import com.tka.entity.ClassSchedule;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService{

	@Autowired
	ClassScheduleDao dao;
	@Override
	public List<ClassSchedule> getAllClassSchedul() {
		
		return dao.getAllClassSchedul();
	}
	@Override
	public ClassSchedule getClassScheduleById(int id) {
		
		return dao.getClassScheduleById(id);
	}
	@Override
	public String createNewClassSchedule(ClassSchedule obj) {
	
		return dao.createNewClassSchedule(obj);
	}
	@Override
	public String updateExistingClassSchedule(ClassSchedule obj) {
	
		return dao.updateExistingClassSchedule(obj);
	}
	@Override
	public String deleteExistingClassScheduleById(int id) {
		
		return dao.deleteExistingClassScheduleById(id);
	}

}
