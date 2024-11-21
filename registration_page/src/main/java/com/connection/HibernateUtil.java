package com.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration config = null;
	private static SessionFactory factory = null;
	
	public static synchronized SessionFactory getSessionFactory() {
		if(factory == null) {
			config = new Configuration().configure();
			factory = config.buildSessionFactory();
		}
		return factory;
	}
	
	
//	private static SessionFactory factory;
//	
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
	// Session session = getSessionFactory.getSerssion();
	// Traczaction
	//session.save();
	// trazaction.commit();
	//session.close();
	
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
