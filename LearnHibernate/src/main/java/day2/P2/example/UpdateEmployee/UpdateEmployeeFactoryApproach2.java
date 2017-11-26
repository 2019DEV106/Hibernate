package day2.P2.example.UpdateEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeFactoryApproach2 {
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		UpdateEmployee updateEmployee = new UpdateEmployee();
		updateEmployee.setEmpID(2);
		updateEmployee.setEmpName("Varadhan");
		Transaction tx = session.beginTransaction();
		session.update(updateEmployee);
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("****Completed SuccessFul******");
		
		
	}

}
