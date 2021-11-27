package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
@GeneratedValue

private int customerId;

private String customerName;

private long customerContactNumber;

private double customerSalary;
@OneToOne
private Address address;
public Customer(String customerName, long customerContactNumber, double customerSalary, Address address) {
	super();
	this.customerName = customerName;
	this.customerContactNumber = customerContactNumber;
	this.customerSalary = customerSalary;
	this.address = address;
}


}
