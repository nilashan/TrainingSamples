package com.virtusa.training.hibernate;

import org.hibernate.Session;

import com.virtusa.training.hibernate.object.Employee;
import com.virtusa.training.hibernate.object.AllocationData;
import com.virtusa.training.hibernate.object.AllocationHistory;
import com.virtusa.training.hibernate.util.HibernateUtilities;

public class Application {

	public static void main(String args[]) {
      save();
      load();
	}

	static void save() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Nilash");
		employee.setAge(24);
		
		
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

	static void load() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Employee employee=(Employee)session.get(Employee.class, 1);
	//	System.out.println(employee.getName()+ " lives at "+employee.getCity());
		employee.getAllocationData().setCity("Colom");
		employee.getAllocationData().setMobile("1222222");
		employee.getAllocationHistories().s
		employee.setAge(11);
		session.save(employee);
		session.getTransaction().commit();
			session.close();
		
	}
}
