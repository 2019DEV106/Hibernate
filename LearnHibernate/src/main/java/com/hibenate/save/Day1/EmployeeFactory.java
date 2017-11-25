package com.hibenate.save.Day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeFactory {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		  
		Transaction tx = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEmpName("Krishna");
		
		session.save(employee);
		tx.commit();
		session.close();
		sessionfactory.close();
	}

}
