package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.tka.entity.Faculty;

@Repository
public interface FacultyDao {

	List<Faculty> getAllFaculty();

	Faculty getFacultyById(int id);

	String createNewFaculty(Faculty obj);

	String updateExistingFaculty(Faculty obj);

	String deleteExistingFacultyById(int id);

}
