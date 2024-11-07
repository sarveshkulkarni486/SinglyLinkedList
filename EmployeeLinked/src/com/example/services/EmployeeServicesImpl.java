package com.example.services;

import java.util.Scanner;

import com.example.beans.Employee;
import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class EmployeeServicesImpl implements EmployeeServices {
	
	EmployeeDao edao;
	Scanner sc = new Scanner(System.in);

	public EmployeeServicesImpl() {
		edao = new EmployeeDaoImpl();
	}


	@Override
	public int addToList() {
		System.out.println("Enter some detials: ");
		System.out.println("Enter id of employee: ");
		int id = sc.nextInt();
		System.out.println("Enter name of employee: ");
		String ename = sc.next();
		Employee e = new Employee(id, ename);
		return edao.addEmployee(e);
		
		
	}


	@Override
	public void displayAll() {
		edao.getAll();
		
	}


	@Override
	public int deleteEmployee() {
		System.out.println("enter id which you want to delete: ");
		int id = sc.nextInt();
		return edao.deleteEmp(id);
	}


	@Override
	public Employee searchById() {
		System.out.println("enter id which you want to search");
		int id = sc.nextInt();
		return edao.searchEmp(id);
	}

}
