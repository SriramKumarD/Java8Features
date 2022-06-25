package java8features;

public class Testing {
	
	void doSomething(Integer i) {
		System.out.println("Integer");
	}
	
	void doSomething(String str) {
		System.out.println("String");
	}

	public static void main(String[] args) {

		Testing  test = new  Testing();
		
		String arg = null;
		test.doSomething(arg);

	}

}
