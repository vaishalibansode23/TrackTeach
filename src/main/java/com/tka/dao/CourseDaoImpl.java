package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tka.entity.Course;

@Repository
public class CourseDaoImpl implements CourseDao{
	@Autowired
	SessionFactory factory;
	 public List<Course> getAllCourse()
	 {
		
			 Session session=factory.openSession();
		 @SuppressWarnings("deprecation")
		Criteria c=session.createCriteria(Course.class);
		 @SuppressWarnings("unchecked")
		List<Course> clist=c.list();
		 return clist;
			 	 
	 }
	public Course getCourseById(int id)
	{
		Session session=factory.openSession();
		session=factory.openSession();
		Course c=session.get(Course.class,id);
		return c;
		}

	public String createNewCourse(Course obj) {
		Session session=factory.openSession();
		session=factory.openSession();
		session.save(obj);
		session.beginTransaction().commit();
		return "New Course created successfully";
	
	}
	@Override
	public String updateExistingCourseById(Course c,int id) {
		Session session=factory.openSession();
	
			session=factory.openSession();
			Course cc=session.get(Course.class, id);
			cc.setCourseName(c.getCourseName());
			session.update(cc);
			session.beginTransaction().commit();
			return "Record updated successfully";
		}
		
	@Override
	public String deleteCourseById(int id) {
		Session session=factory.openSession();
			session=factory.openSession();
			Course c=session.get(Course.class, id);
			session.delete(c);
			session.beginTransaction().commit();
			
			return "Record deleted successfully";
		
	}
	

}
