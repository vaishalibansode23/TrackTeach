package com.tka.service;

import java.util.List;

import com.tka.entity.Department;

public interface DepartmentService {
	List<Department> gelAllDepartment();

	Department getDepartmentById(int id);

	String createNewDepartment(Department d);

	String updateExistingDepartmentById(Department c, int id);

	String deleteDepartmentById(int id);

}
