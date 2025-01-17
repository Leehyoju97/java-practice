package basic16.generic07;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.print(10);
		p.<Integer>print(10);
		
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}
}
