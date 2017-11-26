package day2.P1.example.FetchEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchEmployeeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Object employeeObject  = session.get(FetchEmployee.class,new Integer("1"));
		
		FetchEmployee employee=(FetchEmployee) employeeObject;
		
		System.out.println(employee.getEmpName());
		

	}

}
