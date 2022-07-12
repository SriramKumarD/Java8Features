package java8features;

public class EqualsCheck {

	public static void main(String[] args) {
		
		Double x = new Double(123.45555);  
		Double x1 = new Double(123.45555);
		Long y = new Long(9887544);  
		
		System.out.println(x.equals(x1));
		System.out.println(x.equals(123.45555));

		x = 123.45555;
		
		System.out.println(x == x1);
		
		x = x1;
		
		System.out.println(x == x1);
	}
	

}
