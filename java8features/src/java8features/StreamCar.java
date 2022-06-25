package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCar {

	public static void main(String[] args) {
		
		
		List<EmployeeCar> empList = Arrays.asList(
				new EmployeeCar(1, Arrays.asList("Nexon", "WRV", "Kwid")),
				new EmployeeCar(2, Arrays.asList("Honda", "WRV", "Nissan")),
				new EmployeeCar(3, Arrays.asList("Nexon", "WRV", "Kwid"))
				);
		empList.stream().flatMap(emp -> emp.getCars().stream())
		.collect(Collectors.toSet())
		.forEach( e -> System.out.println(e));
		}

	
	
}

class EmployeeCar {
	
	int empId;
	List<String> cars;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getCars() {
		return cars;
	}
	public void setCars(List<String> cars) {
		this.cars = cars;
	}
	
	public EmployeeCar(int empId, List<String> cars) {
		super();
		this.empId = empId;
		this.cars = cars;
	}
	
	
}
