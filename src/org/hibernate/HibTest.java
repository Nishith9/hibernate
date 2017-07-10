package org.hibernate;

import org.hibernate.cfg.Configuration;

public class HibTest {

	public static void main(String[] args) {
		
		UserData user1 = new UserData();
		
		//user1.setUserId(1); GeneratedValue annotation generates the integer values(starting from 1) defined at UserData
		user1.setUserName("User One");
		
		address addr1= new address();		
		addr1.setCity("city");
		addr1.setState("state");
		addr1.setPin("50266");
		addr1.setStreet("street");		
		
		UserData user2 = new UserData();
		
		user2.setUserId(2);
		user2.setUserName("User Two");
		
		address addr2= new address();
		
		addr2.setCity("city2");
		addr2.setState("state2");
		addr2.setPin("50201");
		addr2.setStreet("street2");
		
		user1.setAddress(addr1);
				
		user2.setAddress(addr2);
		
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		/*user1=null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user1 = (UserData) session.get(UserData.class,2);
		System.out.println("User Data retrieved is "+user1.getUserName());*/

	}

}
