package com.Inheratiance;

public class Multiplication extends Addition{
	
	
	
	public void mutliplication() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

public static void main(String[] args) {
	Multiplication m3=new Multiplication();
	m3.additon();
	m3.mutliplication();
}
}