package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingwithMultipleFields {
	
	public static void main(String args[]) {
		
		List<Employees> list = Arrays.asList(new Employees("Ram", "akumar", 1000),
				new Employees("Sriram", "bkumar", 2000),
				new Employees("Jai", "bkumar", 3000),
				new Employees("KRKR", "bkuku", 4000));
		
		List<Employees> result = list.stream().sorted(Comparator.comparing(Employees::getFirstName).
				thenComparing(Comparator.comparing(Employees::getLastName))).
				collect(Collectors.toList());
		
		result.forEach(s -> System.out.println("Data"+s));
	}

}


class Employees {
	
	String firstName;
	String lastName;
	Integer salary;
	
	public Employees(String firstName, String lastName, Integer salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	
}
