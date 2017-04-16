package com.design.patterns.behavioral.visitor.realtime;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
