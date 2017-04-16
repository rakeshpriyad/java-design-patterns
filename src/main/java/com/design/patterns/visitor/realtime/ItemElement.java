package com.design.patterns.visitor.realtime;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}