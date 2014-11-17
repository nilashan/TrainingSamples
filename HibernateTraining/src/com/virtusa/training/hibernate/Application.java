package com.virtusa.training.hibernate;

import java.util.Date;

import org.hibernate.Session;

import com.virtusa.training.hibernate.object.Employee;
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
		employee.addAllocationHistory(new AllocationHistory(new Date(), "Hibernatettt"));

		employee.setName("Nilashan");
		employee.setAge(30);
		employee.getAllocationData().setCity("Colombo");
		employee.getAllocationData().setMobile("0771236813");
		employee.addAllocationHistory(new AllocationHistory(new Date(), "Virtusa"));
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

	static void load() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		session.beginTransaction();

		Employee employee = (Employee) session.load(Employee.class, 1);
		employee.addAllocationHistory(new AllocationHistory(new Date(), "ROC"));

		System.out.println(employee.getName() + "  " + employee.getAge()
				+ " years old");

		
		employee.addAllocationHistory(new AllocationHistory(new Date(), "BT"));

		for (AllocationHistory allocationHistory : employee
				.getAllocationHistories()) {
			System.out.println(allocationHistory.getAllocationDate() + "-"
					+ allocationHistory.getProjectCode());
		}

		session.getTransaction().commit();
		session.close();
	}
}
