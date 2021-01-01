package com.example.demo.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Class;
import com.example.demo.repository.ClassRepository;

@Repository
public class ClassRepositoryImpl implements ClassRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(Class c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
	}

}
