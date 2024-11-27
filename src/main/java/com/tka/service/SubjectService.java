package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;



import com.tka.entity.Subject;

@Service
public interface SubjectService {

	List<Subject> getAllSubject();

	Subject getSubjectById(int id);

	String createNewSubject(Subject obj);

	String updateExistingSubject(Subject obj);

	String deleteExistingSubjectById(int id);

}
