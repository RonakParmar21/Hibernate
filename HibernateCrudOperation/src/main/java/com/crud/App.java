package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.User;
//
//import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		User u = new User();
//        u.setId(1);
//		u.setName("parmar");
//		u.setEmail("parmar@gmail.com");
//		u.setPassword("parmar@11");
//		u.setGender("male");
//		u.setCity("Bhalgam");

		Configuration cfg = new Configuration();
		cfg.configure("/com/config/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory(); // it is used for introduce to session object. it is
																	// not create every time
		Session session = sessionFactory.openSession(); // it will provide crud operation methods.
		Transaction transaction = session.beginTransaction(); // it will use for transaction success or rollback

//        INSERT OPERATION
//        try {        
//        	session.save(u);
//            transaction.commit();
//            
//            System.out.println("User Details Added Successfully");
//        } catch (Exception e) {
//        	transaction.rollback();
//        	System.out.println(e);
//        }

//        SELECT OPERATION
//        try {
//        	
//        	User user = session.get(User.class, 2L);
//        	
//        	if(user != null) {
//        		
//        		System.out.println("user id is :- " + user.getId());
//            	System.out.println("user name is :- " + user.getName());
//            	System.out.println("user email is :- " + user.getEmail());
//            	System.out.println("user password is :- " + user.getPassword());
//            	System.out.println("user gender is :- " + user.getGender());
//            	System.out.println("user city is :- " + user.getCity());
//            	
//        	} else {
//        		System.out.println("User not found");
//        	}
//        	
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }

//      UPDATE OPERATION
//		try {
//			
//			User u = session.get(User.class, 2L);
//			
//			u.setCity("Bhalgam");
//			
//			session.update(u);
//			transaction.commit();
//
//			System.out.println("User Details Updated Successfully");
//		} catch (Exception e) {
//			transaction.rollback();
//			System.out.println(e);
//		}
		
		
		

//		DELETE OPERATION
		try {

			User u = new User();
			u.setId(1L);

			session.delete(u);
			transaction.commit();

			System.out.println("User Deleted Successfully");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(e);
		}

	}
}
