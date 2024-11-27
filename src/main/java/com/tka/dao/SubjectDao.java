package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;



import com.tka.entity.Subject;

@Repository
public interface SubjectDao {

	List<Subject> getAllSubject();

	Subject getSubjectById(int id);

	String createNewSubject(Subject obj);

	String updateExistingSubject(Subject obj);

	String deleteExistingSubjectById(int id);

}
