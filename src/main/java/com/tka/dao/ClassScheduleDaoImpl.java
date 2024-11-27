package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.ClassSchedule;

@Repository
public class ClassScheduleDaoImpl implements ClassScheduleDao{
	@Autowired
	SessionFactory factory;
	@Override
	public List<ClassSchedule> getAllClassSchedul() {
		Session session=factory.openSession();
		@SuppressWarnings("deprecation")
		Criteria c=session.createCriteria(ClassSchedule.class);
		@SuppressWarnings("unchecked")
		List<ClassSchedule> list=c.list();
		return list;
	}
	@Override
	public ClassSchedule getClassScheduleById(int id) {
		Session session=factory.openSession();
		ClassSchedule obj=session.get(ClassSchedule.class, id);
		return obj;
	}
	@Override
	public String createNewClassSchedule(ClassSchedule obj) {
		Session session=factory.openSession();
		session.save(obj);
		session.beginTransaction().commit();
		return "new ClassSchedule inserted successfully";
	}
	@Override
	public String updateExistingClassSchedule(ClassSchedule obj) {
		Session session=factory.openSession();
		session.saveOrUpdate(obj);
		session.beginTransaction().commit();
		return "Updated successfully";
	}
	@Override
	public String deleteExistingClassScheduleById(int id) {
		Session session=factory.openSession();
		ClassSchedule obj=session.get(ClassSchedule.class, id);
		session.delete(obj);
		session.beginTransaction().commit();
		return "Deleted successfully";
	}

}
