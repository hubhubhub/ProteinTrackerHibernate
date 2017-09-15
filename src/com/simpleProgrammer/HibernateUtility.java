package com.simpleProgrammer;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

public class HibernateUtility {
	 private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	        try {
	            Configuration configuration = new Configuration();
	            configuration.configure();

	            /*return configuration
	                    .buildSessionFactory(new StandardServiceRegistryBuilder()
	                            .applySettings(configuration.getProperties())
	                            .build());  -- does not work while using hibernate.cfg.xml, but works with hibernate.properties*/

	            return configuration
	                    .buildSessionFactory(); 
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(
	                    "There was an error building the factory");
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}

