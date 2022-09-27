package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoiningDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Author author=new Author(201,"Liptuze");
		Book book1=new Book("Datastructure",900,500,author);
		book1.setAuthor(author);//saving author id as foreign key in book table
		session.save(book1);
		session.save(author);
		tx.commit();
		session.close();
		factory.close();
		
		

	}

}
