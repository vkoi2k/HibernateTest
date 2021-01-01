package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Class;
import com.example.demo.repository.ClassRepository;
import com.example.demo.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassRepository classRepo;
	
	@Override
	@Transactional
	public void insert(Class c) {
		classRepo.insert(c);
	}
	
}
