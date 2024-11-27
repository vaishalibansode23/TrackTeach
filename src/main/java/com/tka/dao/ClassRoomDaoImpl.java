package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public class ClassRoomDaoImpl implements ClassRoomDao{
	@Autowired
	SessionFactory factory;
	 public List<Classroom> getAllClassrooms()
	 {
		
			 Session session=factory.openSession();
		 @SuppressWarnings("deprecation")
		Criteria c=session.createCriteria(Classroom.class);
		 @SuppressWarnings("unchecked")
		List<Classroom> clist=c.list();
		 return clist;
			 
			
		
		 
	 }
	public Classroom getClassroomById(int id)
	{
		Session session=factory.openSession();
		session=factory.openSession();
		Classroom c=session.get(Classroom.class,id);
		return c;
		}

	public String createNewClassroom(Classroom obj) {
		Session session=factory.openSession();
		session=factory.openSession();
		session.save(obj);
		session.beginTransaction().commit();
		return "New ClassRoom created successfully";
	
	}
	@Override
	public String updateExistingClassroomById(Classroom c,int id) {
		Session session=factory.openSession();
	
			session=factory.openSession();
			Classroom cc=session.get(Classroom.class, id);
			cc.setClsName(c.getClsName());
			session.update(cc);
			session.beginTransaction().commit();
			return "Record updated successfully";
		}
		
	@Override
	public String deleteClassroomById(int id) {
		Session session=factory.openSession();
			session=factory.openSession();
			Classroom c=session.get(Classroom.class, id);
			session.delete(c);
			session.beginTransaction().commit();
			
			return "Record deleted successfully";
		
	}
	

}
