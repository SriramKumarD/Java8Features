package java8features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {


    public static List<Employee1> getEmployees(){
      return  Stream.of(new Employee1(101,"john","A",60000),
              new Employee1(109,"peter","B",30000),
              new Employee1(102,"mak","A",80000),
              new Employee1(103,"kim","A",90000),
              new Employee1(104,"json","C",15000))
              .collect(Collectors.toList());
    }
}