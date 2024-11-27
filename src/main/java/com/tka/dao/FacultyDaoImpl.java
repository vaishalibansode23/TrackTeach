package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tka.entity.Faculty;

@Repository
public class FacultyDaoImpl implements FacultyDao{
	@Autowired
	SessionFactory factory;
	@SuppressWarnings("deprecation")
	@Override
	public List<Faculty> getAllFaculty() {
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Faculty.class);
		@SuppressWarnings("unchecked")
		List<Faculty> list=c.list();
		return list;
	}
	@Override
	public Faculty getFacultyById(int id) {
		Session session=factory.openSession();
		Faculty obj=session.get(Faculty.class, id);
		return obj;
	}
	@Override
	public String createNewFaculty(Faculty obj) {
		Session session=factory.openSession();
		session.save(obj);
		session.beginTransaction().commit();
		return "new Faculty inserted successfully";
	}
	@Override
	public String updateExistingFaculty(Faculty obj) {
		Session session=factory.openSession();
		session.saveOrUpdate(obj);
		session.beginTransaction().commit();
		return "Updated successfully";
	}
	@Override
	public String deleteExistingFacultyById(int id) {
		Session session=factory.openSession();
		Faculty obj=session.get(Faculty.class, id);
		session.delete(obj);
		session.beginTransaction().commit();
		return "Deleted successfully";
	}

}
