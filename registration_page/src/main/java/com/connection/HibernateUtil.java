package com.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration cfg = null;
	private static SessionFactory factory = null ;
	
	public static synchronized SessionFactory getSessionFactory() {
		if(factory == null) {
			cfg = new Configuration().configure();
			factory = cfg.buildSessionFactory();
		}
		return factory;
	}
	
	
//	static {
//		Configuration cfg = null;
//		try {
//			cfg = new Configuration().configure();			
//			factory = cfg.buildSessionFactory();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	

	
	// open session
	public static Session getSession(){
		if(factory != null)
			return factory.openSession();
		else
			return null;
	}
	
	// close session
	public static void closeSession(Session s) {
		if(s != null)
			s.close();
	}
	
	// close session_factory
	public static void closeSessionFactory(SessionFactory sf) {
		if(sf != null)
			sf.close();
	}
}
