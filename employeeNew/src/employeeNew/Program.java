package employeeNew;

import java.util.Date;
import java.util.Map.Entry;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Program {
public static void main (String args[]){
	System.out.println("Hello World");
	
Session session = HibernateUtilities.getSessionFactory().openSession();
session.beginTransaction();
	

	employee empl = new employee();
	empl.setName("priya");
	empl.getHistory().add(new employeeHistory(new Date(),"set the Name Priya"));

	empl.setRole("Software Developer");
	empl.getHistory().add(new employeeHistory(new Date(),"set the Role Software Developer"));

	empl.setAddress("Austin");
	session.save(empl);
	session.getTransaction().commit();
	session.beginTransaction();
	
	employee loadedempl = session.load(employee.class,1);
	System.out.println(loadedempl.getName());
	System.out.println(loadedempl.getAddress());
	System.out.println(loadedempl.getRole());
	for(employeeHistory history :loadedempl.getHistory()){
		//System.out.println("Key value is :"+history.getKey());
		System.out.println(history.getEntryTime().toString()+" "+history.getEntry());
	}
	
	loadedempl.getHistory().add(new employeeHistory(new Date(),"Added"));

	
	
	
	session.getTransaction().commit();
	
	
	
	session.close();
	HibernateUtilities.getSessionFactory().close();
}
}
