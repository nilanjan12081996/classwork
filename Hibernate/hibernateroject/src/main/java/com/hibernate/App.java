package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
//       Book book3=new Book("java complete reference",700.00,900);
//       session.save(book3);
//       tx.commit();
       //Retrieve data from database
//       Book book=(Book)session.get(Book.class, 3);
//       System.out.println(book);
//       Book book2=(Book)session.get(Book.class, 2);
//       System.out.println(book2);
       Book book=(Book)session.load(Book.class, 2);
       //System.out.println(book.getBookName());
       System.out.println(book);
//       Book book1=(Book)session.load(Book.class, 1);
//       System.out.println(book1);
//       
       session.close();
//       Session session2=factory.openSession();
//       Book book3=(Book)session2.get(Book.class,2);
//       System.out.println(book3);
//       Book book4=(Book)session2.get(Book.class,2);
//       System.out.println(book4);
//       session2.close();
       factory.close();
    }
}
