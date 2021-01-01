package com.example.demo.transform;

import java.text.DateFormat;
import java.text.ParseException;

import com.example.demo.dto.ClassDTO;
import com.example.demo.model.Class;

public class DateTransform {
	private DateFormat format;
	
	public DateTransform(DateFormat format) {
		this.format = format;
	}
	
	public Class apply(ClassDTO dto) {
		Class c = new Class();
		c.setName(dto.getName());
		c.setNumberOfStudent(dto.getNumberOfStudent());
		try {
			c.setStartDate(format.parse(dto.getStartDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;
	}
}
