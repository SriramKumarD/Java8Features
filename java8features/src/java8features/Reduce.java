package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,3,4,5,8,18);
		
		
		List<String> words = Arrays.asList("corejava", "spring", "hibernate");
		
		//Using reduce
		
		Integer result = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(result);
		
		Optional<Integer> result1 = numbers.stream().reduce(Integer::sum);
		System.out.println(result1.get());
		
		Integer multiply = numbers.stream().reduce(1, (a,b) -> a*b);
		System.out.println(multiply);
		
		//Getting maximum value 
		Integer max = numbers.stream().reduce(0, (a,b) -> a>b? a:b);
		System.out.println(max);
		
		Optional<Integer> max1 = numbers.stream().reduce(Integer::max);
		System.out.println(max1.get());
		
		
		//getting the string which is having maximum length
		Optional<String> longestWord = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1:word2);
		System.out.println(longestWord.get());
		
		
		
		
		
		List<Employee1> empList = EmployeeDatabase.getEmployees();
		
		//Avg Salary
		double avgSalary = empList.stream().filter(emp -> emp.getGrade().equals("A"))
				.map(emp -> emp.getSalary())
				.mapToDouble(i->i)
				.average()
				.getAsDouble();
		
		System.out.println(avgSalary);
		
		//Sum salary
		double sumSalary = empList.stream().filter(emp -> emp.getGrade().equals("A"))
				.map(emp -> emp.getSalary())
				.mapToDouble(i->i)
				.sum();
		System.out.println(sumSalary);
	}

}
