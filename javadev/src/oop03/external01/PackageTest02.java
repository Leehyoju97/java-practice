package oop03.external01;

import basic.*;
import basic.test.Car;

public class PackageTest02 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		Car car = new Car();
		car.drive();
	}
}
