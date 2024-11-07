package com.example.dao;

import com.example.beans.Employee;

public interface EmployeeDao {


	int addEmployee(Employee e);

	void getAll();

	int deleteEmp(int id);

	Employee searchEmp(int id);

}
