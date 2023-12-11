package com.example.MyFirstSpring.hibernate;

import org.hibernate.Session;

public class HibernateMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		HibernateUtil.close();
	}
}
