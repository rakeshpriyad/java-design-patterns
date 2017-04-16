package com.design.patterns.visitor.realtime.customer.report;

/**
 * 
 * We want to create a reporting module in our application to make statistics
 * about a group of customers. The statistics should made very detailed so all
 * the data related to the customer must be parsed. All the entities involved in
 * this hierarchy must accept a visitor so the CustomerGroup, Customer, Order
 * and Item are visitable objects.
 * 
 * In the example we can see the following actors:
 * 
 * IVisitor and IVisitable interfaces CustomerGroup, Customer, Order and Item
 * are all visitable classes. A CustomerGroup represents a group of customers,
 * each Customer can have one or more orders and each order can have one ore
 * more Items. GeneralReport is a visitor class and implements the IVisitor
 * interface.
 * 
 * @author aayushraj
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Customer c = new Customer("customer1");
		c.addOrder(new Order(".order1", "..item1"));
		c.addOrder(new Order(".order2", "..item1"));
		c.addOrder(new Order(".order3", "..item1"));

		Customer c2 = new Customer("customer2");
		Order o = new Order(".order_a");
		o.addItem(new Item("..item_a1"));
		o.addItem(new Item("..item_a2"));
		o.addItem(new Item("..item_a3"));
		c2.addOrder(o);
		c2.addOrder(new Order(".order_b", "..item_b1"));

		CustomerGroup customers = new CustomerGroup();
		customers.addCustomer(c);
		customers.addCustomer(c2);

		GeneralReport visitor = new GeneralReport();

		customers.accept(visitor);

		visitor.displayResults();
	}
}