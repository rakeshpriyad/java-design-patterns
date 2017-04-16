package com.design.patterns.behavioral.visitor.realtime;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}