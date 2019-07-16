package com.finals.datastruct;

public class Test {
	public static void main(String[] args) {
		BiTree root = new BiTree(100);
		root.add(new BiTree(150));
		root.add(new BiTree(50));
		root.add(new BiTree(550));
		root.add(new BiTree(30));
		root.add(new BiTree(70));
		root.middle_trav();
	}
}
