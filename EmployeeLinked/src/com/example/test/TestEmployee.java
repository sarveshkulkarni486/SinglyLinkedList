package com.example.test;

import java.util.Scanner;

import com.example.beans.Employee;
import com.example.services.EmployeeServices;
import com.example.services.EmployeeServicesImpl;

public class TestEmployee {

	public static void main(String[] args) {
		int choice = 0;
		EmployeeServices eserv = new EmployeeServicesImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your choice ");
			System.out.println("1. Add employee  \n2. Delete employee \n3. Search by id");
			System.out.println("4. Display All \n5. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				int res = eserv.addToList();
				if(res==1) {
					System.out.println("First employee addedd successfully");
				}
				else if(res==2) {
					System.out.println("Employee added successfully");
				}
				else if(res==-1) {
					System.out.println("Employee id already exists");
				}
				
			}
			case 2->{
				int stat = eserv.deleteEmployee();
				if(stat==1) {
					System.out.println("Employee deleted");
				}
				else if(stat==-1) {
					System.out.println("List is empty");
				}
				else {
					System.out.println("Id not found");
				}
			}
			case 3->{
				Employee e = eserv.searchById();
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Employee not found or list is empty");
				}
			}
			case 4->{
				eserv.displayAll();
			}
			case 5->{
				System.out.println("Thank you...");
			}
			}
		}while(choice!=5);

	}

}
