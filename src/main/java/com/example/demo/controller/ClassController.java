package com.example.demo.controller;

import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClassDTO;
import com.example.demo.service.ClassService;
import com.example.demo.transform.DateTransform;
import com.example.demo.model.Class;


@RestController
@RequestMapping("/classes")
public class ClassController {
	@Autowired
	private ClassService classService;
	@Autowired
	private DateFormat dateFormat;
	
	@PostMapping
	public Class insert(@RequestBody ClassDTO classDTO) {
		DateTransform transform = new DateTransform(dateFormat);
		Class c = transform.apply(classDTO);
		classService.insert(c);
		return c;
	}
}
