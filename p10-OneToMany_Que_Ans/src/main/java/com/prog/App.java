package com.prog;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prog.bean.Answer;
import com.prog.bean.Question;


public class App 
{
    public static void main( String[] args )
    {
    	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction begin = session.beginTransaction();
    	
//    	Question q = new Question();
//    	q.setQ_que("What is Java");
//    	
//    	Answer a = new Answer();
//    	a.setOpt("First: ");
//    	a.setA_ans("Object Oriented..");
//    	Answer b = new Answer();
//    	b.setOpt("Second: ");
//    	b.setA_ans("Platform Indetandent");
//    	Answer c = new Answer();
//    	c.setOpt("Third: ");
//    	c.setA_ans("Internet programming");
//    	List<Answer> list = new ArrayList<>();
//    	list.add(a);
//    	list.add(b);
//    	list.add(c);
//    	
//    	q.setAnswer(list);
//    	
//  // for by-directionly...............
//    	a.setQuestion(q);
//    	b.setQuestion(q);
//    	c.setQuestion(q);
    	
//    	session.persist(q);
//    	session.persist(a);
//    	session.persist(b);
//    	session.persist(c);
//    	begin.commit();
//    	session.close();
//    	
//    	System.out.println("Success fully");
    	
    	
    	
   // fetch......1.question side.....2.answer side
    	
//    	Question q = (Question)session.get(Question.class, 1);
//    	System.out.println("Que is: "+q.getQ_que());
//    	for(Answer a : q.getAnswer()) {
//    		System.out.println("Option "+a.getOpt()+" || ans is: "+a.getA_ans());
//    	}
    	
    	Answer a = (Answer) session.get(Answer.class, 1);
    	System.out.println("Que is :"+a.getQuestion().getQ_que());	
    
    	
    }
}
