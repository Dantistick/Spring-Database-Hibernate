package com.example.MyFirstSpring;

import com.example.MyFirstSpring.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyFirstSpringApplication.class, args);

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.close();
		HibernateUtil.close();
	}
}
