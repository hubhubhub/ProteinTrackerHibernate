package com.simpleProgrammer;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		User user = new User();
		user.setName("joe");
		user.setGoal(250);
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		session.close();
	}

}
