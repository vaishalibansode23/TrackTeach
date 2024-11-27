package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	@Autowired
	SessionFactory factory;


	public List<Department> gelAllDepartment() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		@SuppressWarnings("deprecation")
		Criteria c=session.createCriteria(Department.class);
		@SuppressWarnings("unchecked")
		List<Department> dlist=c.list();
		return dlist;
		}
	

	@Override
	public Department getDepartmentById(int id) {
		Session session=factory.openSession();
			session=factory.openSession();
			Department d=session.get(Department.class, id);
			return d;
		}
	

	@Override
	public String createNewDepartment(Department d) {
		Session session=factory.openSession();
			session.save(d);
			session.beginTransaction().commit();
			return "New Department created successfully";
		}
	

	@Override
	public String updateExistingDepartmentById(Department c, int id) {
		Session session=factory.openSession();
			Department dd=session.get(Department.class, id);
			dd.setDeptName(c.getDeptName());
			session.update(dd);
			session.beginTransaction().commit();
		    return "Record updated successfully";
		}


	@Override
	public String deleteDepartmentById(int id) {
		Session session=factory.openSession();
			Department d=session.get(Department.class, id);
			session.delete(d);
			session.beginTransaction().commit();
			
			return "Record Deleted Successfully";
		}
	
	

}
