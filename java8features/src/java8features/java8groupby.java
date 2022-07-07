package java8features;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class java8groupby {

	public static void main(String[] args) {


		List<String> fruits =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
		
		Map<String, Long> resultMap = fruits.stream().
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Count the fruits :" +resultMap);

	
	//Groupby+counting and Groupby+qty
	
	List<Item> items = Arrays.asList(
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 20, new BigDecimal("19.99")),
            new Item("orang", 10, new BigDecimal("29.99")),
            new Item("watermelon", 10, new BigDecimal("29.99")),
            new Item("papaya", 20, new BigDecimal("9.99")),
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
    );

	Map<String, Long> map = items.stream().
			collect(Collectors.groupingBy(Item::getName, Collectors.counting())) ;
	
	Map<String, Integer> result = items.stream().
			collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
	
	
	System.out.println("Maping ::: "+map);
	System.out.println("result Maping ::: "+result);
	}
	
}



class Item {

    private String name;
    private int qty;
    private BigDecimal price;
    
    
	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

     
}
