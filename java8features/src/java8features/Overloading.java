package java8features;

public class Overloading {
	
	static void doSomething(Object c) {
		System.out.println("Object printing");
	}
	static void doSomething(String c) {
		System.out.println("String printing");
	}


	public static void main(String[] args) {
		
		Overloading.doSomething(null);

	}

}
