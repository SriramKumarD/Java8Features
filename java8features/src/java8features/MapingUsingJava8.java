package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapingUsingJava8 {

	public static void main(String args[]) {
		
		List<String> strs = Arrays.asList("Test1", "Test2", "Test3");
		
		Map<Object, Object> map = strs.stream().
				collect(Collectors.toMap(s-> strs.indexOf(s) , s->s));
		System.out.println(map);
	}
}
