package java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;

public class predicateExample {

	public static void main(String[] args) {
		
		//Predicate, Function, Consumer and Suppiler
		
		Predicate<String> predicate = s -> s.length() >=5;
		System.out.println("String is greater than 5 : " +predicate.test("Srir"));
		
		Predicate<String> predicate1 = s -> s.length() %2 == 0;
		System.out.println("The length of the String : " +predicate1.test("Srir"));
		
		//merging two things
		System.out.println("Merging>>>"+predicate.and(predicate1).test("Sriramkumar"));
		
		//or condition
		System.out.println("OR condition>>"+predicate.or(predicate1).test("Sriramkumar"));
		
		//negate 
		System.out.println("negate condition>>"+predicate.negate().test("Sriramkumar"));
		
		//Function Example
		
		
		Function<Integer, Integer> func = i -> (i == null ? 0 : i*i);
			
		System.out.println("Square of 5 :" + func.apply(null));
		
		
		
		//Functional chaining 
		Function<Integer, Integer> doubleit = i -> i*2;
		
		Function<Integer, Integer> cubeit = i -> i*i*i;
		
		System.out.println("Functionl chaining : andThen >" +doubleit.andThen(cubeit).apply(2));
		
		System.out.println("Functionl chaining : compose >" +doubleit.compose(cubeit).apply(2));
		
		
		
		//Consumer and Consumer chaining
		
		Consumer<Integer> consumer = i -> System.out.println("Consumer example :" + i*i);
		consumer.accept(2);
		
		Consumer<Integer> consumer1 = i -> System.out.println("Consumer example :" + i*2);
		consumer1.accept(2);
		
		consumer.andThen(consumer1).accept(2);
		
		
		//Supplier 
		
		Supplier<Date> currentDate = () -> new Date();
		System.out.println("Current Date :" +currentDate.get());
		 
		
		//BiPredicate and BiFunction
		BiPredicate<Integer, Integer> biPredicate = (a,b) -> a+b >=5;
		System.out.println("BiPredicate check : " +biPredicate.test(2,4));
		
		
		BiFunction<Integer, Integer, Integer> biFunc = (a,b) -> a+b;
		System.out.println("BiFunction check :" + biFunc.apply(5,4));
		
		BiConsumer<Integer,Integer> biFunc1 = (a,b) -> System.out.println("BiConsumers:"+a+"Seconda"+b);
		biFunc1.accept(5,4);
		
		Integer[] intArray = {1,2,3};
		
		System.out.println(Arrays.asList(intArray));
	}
	

}
