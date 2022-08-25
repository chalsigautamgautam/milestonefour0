package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Employee;


@Service
public class EmployeeService {
	private static List<Employee> db = new ArrayList<>();

	public EmployeeService() {
		db = putEmployees();
	}

	private List<Employee> putEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "halsey", 800));
		list.add(new Employee(2, "V", 760));
		list.add(new Employee(3, "Jungkook", 541));
		list.add(new Employee(4, "KIM", 901));
		list.add(new Employee(5, "Nmajoon", 705));
		list.add(new Employee(6, "Suga", 600));
		list.add(new Employee(7, "Taehyung", 390));
		list.add(new Employee(8, "Eun woo", 770));
		list.add(new Employee(9, "Hobi",890));
		list.add(new Employee(10, "J HOPE", 880));
		
		return list;
	}

	public List<Employee> getAll() {
		return db;
	}

	public Employee getById(int id) {
		return db.stream().filter(x -> x.getId() == id).findFirst().get();
	}
}