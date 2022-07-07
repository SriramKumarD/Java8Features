package JavaQuestions;


class A {
	A() {
		System.out.println("CA");
	}
	void test () {
		System.out.println("sss");
	}
	void test1() {
		System.out.println("test1");
	}
	
}
class B extends A {
	B () {
		System.out.println("CB");
	}
	void test () {
		System.out.println("sss11");
	}
	void test2() {
		System.out.println("test2");
	}
}
public class BaseClassCheck {

	public static void main(String[] args) {
		
		A obj = new B();
		obj.test();
		obj.test1();
		//obj.test2();
		
	}

}
