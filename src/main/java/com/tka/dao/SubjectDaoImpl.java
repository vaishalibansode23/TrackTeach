package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.tka.entity.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao{
	@Autowired
	SessionFactory factory;
	@SuppressWarnings("deprecation")
	@Override
	public List<Subject> getAllSubject() {
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Subject.class);
		@SuppressWarnings("unchecked")
		List<Subject> list=c.list();
		return list;
	}
	@Override
	public Subject getSubjectById(int id) {
		Session session=factory.openSession();
		Subject obj=session.get(Subject.class, id);
		return obj;
	}
	@Override
	public String createNewSubject(Subject obj) {
		Session session=factory.openSession();
		session.save(obj);
		session.beginTransaction().commit();
		return "new Subject inserted successfully";
	}
	@Override
	public String updateExistingSubject(Subject obj) {
		Session session=factory.openSession();
		session.saveOrUpdate(obj);
		session.beginTransaction().commit();
		return "Updated successfully";
	}
	@Override
	public String deleteExistingSubjectById(int id) {
		Session session=factory.openSession();
		Subject obj=session.get(Subject.class, id);
		session.delete(obj);
		session.beginTransaction().commit();
		return "Deleted successfully";
	}

}
