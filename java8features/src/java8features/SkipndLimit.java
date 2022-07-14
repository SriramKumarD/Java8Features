package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipndLimit {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		list.stream().filter(s -> s%2 == 0)
		.limit(2).collect(Collectors.toList())
		.forEach(s -> System.out.println("Limit :" +s));

		list.stream().filter(s -> s%2 == 0)
		.skip(2).collect(Collectors.toList())
		.forEach(s -> System.out.println("Skip :" +s));
	}

}
