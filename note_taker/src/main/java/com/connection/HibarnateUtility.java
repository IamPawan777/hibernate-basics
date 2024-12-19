package com.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibarnateUtility {
	
	private static SessionFactory factory = null;
		
	public static synchronized SessionFactory getSessionFactory() {
		if (factory == null) {
			Configuration con = new Configuration().configure();
			factory = con.buildSessionFactory();
		}
		return factory;
	}
	
}
