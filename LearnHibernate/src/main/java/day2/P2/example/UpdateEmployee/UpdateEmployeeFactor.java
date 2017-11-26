package day2.P2.example.UpdateEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeFactor {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Object o = session.get(UpdateEmployee.class, new Integer(1));

		UpdateEmployee employee = (UpdateEmployee)o;

		Transaction tx = session.beginTransaction();
		employee.setEmpName("Krishnamoorthy");
		tx.commit();
		session.close();
		factory.close();

	}

}
