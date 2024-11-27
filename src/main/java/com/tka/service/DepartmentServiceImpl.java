package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmentDao;
import com.tka.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao impl;
	public List<Department> gelAllDepartment() {
		// TODO Auto-generated method stub
		return impl.gelAllDepartment();
		
	}
	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return impl.getDepartmentById(id) ;
	}
	@Override
	public String createNewDepartment(Department d) {
		// TODO Auto-generated method stub
		return impl.createNewDepartment(d);
	}
	@Override
	public String updateExistingDepartmentById(Department c, int id) {
	
		return impl.updateExistingDepartmentById(c,id);
	}
	@Override
	public String deleteDepartmentById(int id) {
		// TODO Auto-generated method stub
		return impl.deleteDepartmentById(id);
	}

}
