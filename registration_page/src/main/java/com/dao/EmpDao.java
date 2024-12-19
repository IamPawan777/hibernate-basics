package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connection.HibernateUtil;
import com.entity.Employee;

public class EmpDao {
	
	private SessionFactory factory;
	
	public EmpDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}

//	save
	public boolean saveEmp(Employee emp) {
		boolean f = true;
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		
		tx.commit();
		HibernateUtil.closeSession(session);
		
		return f;
	}
}
