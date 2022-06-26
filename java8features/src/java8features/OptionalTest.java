package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {


	public static void main(String[] args) {
	
		Optional<Integer> possible = Optional.of(5);
		possible.ifPresent(s -> System.out.println(s));
		
		
		Optional<Integer> possible1 = Optional.empty();
		possible1.ifPresent(s -> System.out.println("Empty"+s));
		
		
		System.out.println("ElseStatement:"+possible1.orElse(2));

		
		Optional<Integer> possible2 = Optional.ofNullable(null); 
		possible2.ifPresent(s -> System.out.println("Null"+s));
		
		//System.out.println("ElseStatementNull:"+possible2.orElseThrow(NullPointerException::new));
		
		List<Company> cmpList = Arrays.asList(new Company(1, "RDR"),
				new Company(2, "SKD"),
				new Company(3, "RDR"));
		
		Optional<List<Company>> compListOptional = Optional.of(cmpList);
		
		compListOptional.get().stream().filter(s -> s.getCompName().equalsIgnoreCase("RDR"))
		.findAny().ifPresent(s->System.out.println("RDR:"+s.getCompName()));
		
	}

}

class Company {
	
	int compId;
	String compName;
	public Company(int compId, String compName) {
		super();
		this.compId = compId;
		this.compName = compName;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	
	
}
