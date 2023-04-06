package com.FactoryMethod;

public class A {
private  static final A obj=new A();
private A() {
	System.out.println("private constructor");
}
public  A  getA() {
	System.out.println("factory method");
	return obj;
}
public void msg() {
	System.out.println("simple msg");
}
}

