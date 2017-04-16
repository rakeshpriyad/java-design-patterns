package com.design.patterns.visitor.realtime;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
