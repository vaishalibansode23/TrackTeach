package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.tka.entity.Faculty;

@Service
public interface FacultyService {

	List<Faculty> getAllFaculty();

	Faculty getFacultyById(int id);

	String createNewFaculty(Faculty obj);

	String updateExistingFaculty(Faculty obj);

	String deleteExistingFacultyById(int id);

}
