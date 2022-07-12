package java8features;

import java.io.IOException;

class A {
	
	void methodA() throws ArrayIndexOutOfBoundsException {
		System.out.println("Super");
	}
}
class B extends A {
	
	void methodA() throws IndexOutOfBoundsException {
		System.out.println("Base");
	}
}
public class ExceptionCheck1 {

	public static void main(String[] args) throws IOException {
		
		A obj = new B();
		obj.methodA();

	}
	
}
