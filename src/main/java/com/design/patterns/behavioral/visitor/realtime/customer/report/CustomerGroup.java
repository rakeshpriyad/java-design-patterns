package com.design.patterns.behavioral.visitor.realtime.customer.report;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerGroup {
	private List<Customer> customers = new ArrayList<Customer>();

	public void accept(IVisitor visitor) {
		for (Iterator<Customer> it = customers.iterator(); it.hasNext();) {
			(it.next()).accept(visitor);
		}
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

}