package com.ass.StudentLaptops.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ass.StudentLaptops.entity.Laptops;
import com.ass.StudentLaptops.entity.Student;
import com.ass.StudentLaptops.util.SessionFactoryUtil;

public class StudentRepository {
	
	public void saveStudentData(Student student) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(student);
		transaction.commit();	
		
	}
	
	public void saveLaptopsData(Laptops laptops) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(laptops);
		transaction.commit();	
	}

}
