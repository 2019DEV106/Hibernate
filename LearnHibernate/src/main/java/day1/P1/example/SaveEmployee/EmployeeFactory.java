package day1.P1.example.SaveEmployee;

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
		
		Employee employee1 = new Employee();
		employee1.setEmpName("Krishna");
		
		Employee employee2 = new Employee();
		employee2.setEmpName("moorthy");
		
		session.save(employee1);
		session.save(employee2);
		tx.commit();
		session.close();
		sessionfactory.close();
	}

}
