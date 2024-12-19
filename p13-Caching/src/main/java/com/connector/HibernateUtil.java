package com.connector;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			Configuration con = new Configuration().configure();
			factory = con.buildSessionFactory();
		}
		return factory;
	}
	
}
