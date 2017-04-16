package com.design.patterns.behavioral.visitor.realtime.customer.report;
public interface IVisitor {
	   public void visit(Customer customer);
	   public void visit(Order order);
	   public void visit(Item item); 
}