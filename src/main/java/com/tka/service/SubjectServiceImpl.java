package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.tka.dao.SubjectDao;
import com.tka.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectDao dao;
	@Override
	public List<Subject> getAllSubject() {
		
		return dao.getAllSubject();
	}
	@Override
	public Subject getSubjectById(int id) {
		
		return dao.getSubjectById(id);
	}
	@Override
	public String createNewSubject(Subject obj) {
	
		return dao.createNewSubject(obj);
	}
	@Override
	public String updateExistingSubject(Subject obj) {
	
		return dao.updateExistingSubject(obj);
	}
	@Override
	public String deleteExistingSubjectById(int id) {
		
		return dao.deleteExistingSubjectById(id);
	}

}
