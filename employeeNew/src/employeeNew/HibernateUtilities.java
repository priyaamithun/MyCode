package employeeNew;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtilities {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static{
		try
	    {
	        //Configuration configuration = new Configuration().configure();
	        serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
	                                    .build();
	        Metadata metadata = new MetadataSources(serviceRegistry)
	                                .getMetadataBuilder().build();
	        sessionFactory = metadata.getSessionFactoryBuilder().build();

	    }catch(HibernateException exception)
	    {
	        System.out.println("problem creating session factory!"+exception.getMessage());
	    }
	}

	public static SessionFactory getSessionFactory(){

	    return sessionFactory;
	}
}
