package com.example.dao;

import com.example.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	class Node {
		Employee data;
		Node next;
		public Node(Employee e) {
			this.data = e;
			this.next = null;
		}
	}
	Node head;
	public EmployeeDaoImpl(){
		this.head=null;
	}
	
	@Override
	public int addEmployee(Employee e) {
		Node newnode = new Node(e);
		if(head==null) {
			head = newnode;
			return 1;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			if(temp.data.getEid() == e.getEid()) {
				return -1; 
			}
			temp.next = newnode;
			return 2;
		}
	}

	@Override
	public void getAll() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
	}

	@Override
	public int deleteEmp(int id) {
		if(head==null) {
			return -1;
		}
		else {
			Node temp = head;
			if(head.data.getEid()==id && temp==head) {
				head = head.next;
				temp.next = null;
				temp = null;
				return 1;
			}
			else {
				Node prev = null;
				while(temp!=null && temp.data.getEid()!=id) {
					prev = temp;
					temp = temp.next;
				}
				/*if(temp.data.getEid() == id && temp == head) {
					head = temp.next;
					temp.next = null;
					temp = null;
				}
				*/
				if(temp.next == null && temp.data.getEid()==id) {
					prev.next=null;
					temp.next=null;
					temp = null;
					return 1;
				}
				else if(temp!=null && temp.data.getEid()==id) {
					prev.next = temp.next;
					temp.next = null;
					temp = null;
					return 1;
				}
			}
		}
		return -2;
	}

	@Override
	public Employee searchEmp(int id) {
		if(head==null) {
			return null;
		}
		else {
			Node temp = head;
			while(temp!=null && temp.data.getEid()!=id) {
				temp = temp.next;
			}
			if(temp.next == null && temp.data.getEid()==id) {
				return temp.data;
			}
			else if(temp.next!=null && temp.data.getEid()==id) {
				return temp.data;
			}
		}
		return null;
	}
	
	

	

}
