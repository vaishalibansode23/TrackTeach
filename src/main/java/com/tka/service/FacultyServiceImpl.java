package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tka.dao.FacultyDao;

import com.tka.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService{

	@Autowired
	FacultyDao dao;
	@Override
	public List<Faculty> getAllFaculty() {
		
		return dao.getAllFaculty();
	}
	@Override
	public Faculty getFacultyById(int id) {
		
		return dao.getFacultyById(id);
	}
	@Override
	public String createNewFaculty(Faculty obj) {
	
		return dao.createNewFaculty(obj);
	}
	@Override
	public String updateExistingFaculty(Faculty obj) {
	
		return dao.updateExistingFaculty(obj);
	}
	@Override
	public String deleteExistingFacultyById(int id) {
		
		return dao.deleteExistingFacultyById(id);
	}

}
