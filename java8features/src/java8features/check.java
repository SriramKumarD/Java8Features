package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class check {

	public static void main(String[] args) {
		
		List<String>  list = new ArrayList<String>();
		list.add("Sriram");
		list.add("Kumar");
		list.add("ram");
		list.add("saraswathi");
		
		for(int i = 0; i < list.size(); i++) {
		    if(list.get(i).equals("saraswathi")) {
		        list.remove("saraswathi");
		        i--;
		    }
		}
		System.out.println("List"+list);

	}

}
