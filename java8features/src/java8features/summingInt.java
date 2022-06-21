package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class summingInt {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			  new Employee(1, 1000,"Chandra Shekhar", 6000),
			   new Employee(1, 1000, "Rajesh", 8000), 
			   new Employee(1, 1004,"Rahul", 9000), 
			   new Employee(1, 1001, "Suresh", 12000),
			   new Employee(1, 1004, "Satosh", 8500));
		
		int total = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		
		System.out.println("Total Salary :"+total);
		
		List<Employee> highestSalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
		highestSalary.forEach(s -> System.out.println("Sorted Salary :"+s.getSalary()));
		System.out.println(highestSalary.get(employees.size()-2).getSalary());
	}

}


class Employee {
	 private int id;
	 private int deptId;
	 private String name;
	 private int salary;

	 public Employee(int id, int deptId, String name, int salary) {
	  super();
	  this.id = id;
	  this.deptId = deptId;
	  this.name = name;
	  this.salary = salary;
	 }
	 public int getId() {
	  return id;
	 }
	 public String getName() {
	  return name;
	 }
	 public int getSalary() {
	  return salary;
	 }
	 public int getDeptId() {
	  return deptId;
	 }

	}