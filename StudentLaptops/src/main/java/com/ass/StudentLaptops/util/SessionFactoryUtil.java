package com.ass.StudentLaptops.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ass.StudentLaptops.entity.Laptops;
import com.ass.StudentLaptops.entity.Student;


public class SessionFactoryUtil {
	
	private  static SessionFactory sessionFactory=null;
	
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getConnection());
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Laptops.class);//it provids mapping info
			
			sessionFactory = cfg.buildSessionFactory();
			
		}
		return sessionFactory;
	}

}
