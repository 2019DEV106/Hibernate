package day2.P3.example.DeleteEmployee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeFactory {

	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		Object o = session.load(DeleteEmployee.class,new Integer(1));
		DeleteEmployee deleteEmployee=(DeleteEmployee)o;
		
		Transaction tx = session.beginTransaction();
		session.delete(deleteEmployee);
		tx.commit();
	}
}
