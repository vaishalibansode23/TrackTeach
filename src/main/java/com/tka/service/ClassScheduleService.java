package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.entity.ClassSchedule;

@Service
public interface ClassScheduleService {

	List<ClassSchedule> getAllClassSchedul();

	ClassSchedule getClassScheduleById(int id);

	String createNewClassSchedule(ClassSchedule obj);

	String updateExistingClassSchedule(ClassSchedule obj);

	String deleteExistingClassScheduleById(int id);

}
