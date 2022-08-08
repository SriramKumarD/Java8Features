package java8features;
import java.util.function.BiFunction;

public class CountBinaryOnes {
	
	private static long countBinaryOnes(int a, int b) {
		
		//Integer c = a*b;
		

		BiFunction<Integer, Integer ,Integer> func = (x, y) -> x*y;
		
		String binary = Integer.toBinaryString(func.apply(a, b));
		
		
		long characterStream = binary.chars()
				  .mapToObj(c -> (char) c).filter(x -> x == '1').count();

		return characterStream;
	}

	public static void main(String[] args) {

		int a = 3 , b = 7;
		
		System.out.println(countBinaryOnes(a, b));
		//countBinaryOnes(a, b);
	}

}
