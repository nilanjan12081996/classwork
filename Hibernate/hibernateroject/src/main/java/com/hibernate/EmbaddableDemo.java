package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbaddableDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	//	Certificate cer=new Certificate("Python","4 months");
		
//		Student1 std=new Student1("Shawin","Darjeeling", cer);
//		Certificate cer=new Certificate("Fullstack","4 months");
//		Student1 std=new Student1("Nilanjan","Kolkata", cer);
//		Certificate cer3=new Certificate("AWS","4 months");
//		Student1 std3=new Student1("Pallab","Kolkata", cer3);
//		Certificate cer4=new Certificate("AWS","4 months");
//		Student1 std4=new Student1("Randhir","north 24 paraganas", cer4);
//	session.save(std3);
//	session.save(std4);
		//to delete data
//		Student1 std4=session.get(Student1.class,4);
//		session.delete(std4);
//		tx.commit();
//		session.clear();//clear the cache
		//session.evict(std4);//only one object which i want to clear from cache
		
		factory.close();
		session.close();
	}

}
