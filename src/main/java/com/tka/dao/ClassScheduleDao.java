package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.entity.ClassSchedule;

@Repository
public interface ClassScheduleDao {

	List<ClassSchedule> getAllClassSchedul();

	ClassSchedule getClassScheduleById(int id);

	String createNewClassSchedule(ClassSchedule obj);

	String updateExistingClassSchedule(ClassSchedule obj);

	String deleteExistingClassScheduleById(int id);

}
