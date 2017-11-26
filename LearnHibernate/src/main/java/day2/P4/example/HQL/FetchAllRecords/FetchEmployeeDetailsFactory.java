package day2.P4.example.HQL.FetchAllRecords;

import java.util.Iterator;
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class FetchEmployeeDetailsFactory {
	
	public static void main(String[] args) {
		//FetchEmployee 
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
 		 Query query = session.createQuery("from FetchEmployeeDetails");
 		 List<FetchEmployeeDetails> emplist = query.list();
 		 System.out.println(emplist);
 		 for (FetchEmployeeDetails fetchEmployee : emplist) {
			System.out.println("emp id "+fetchEmployee.getEmpID());
		}
 		 
 		 
 		 

		// Create CriteriaBuilder
//		CriteriaBuilder builder = session.getCriteriaBuilder();

		// Create CriteriaQuery
//		CriteriaQuery<FetchEmployee> criteria = builder.createQuery(FetchEmployee.class);
	}

}
