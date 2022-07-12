package java8features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCheck {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,4,5,6,6);
		list.add(3); // Arrays.asList is immutable so we can't perform add operation.It will throw the UnsupportedOperationException
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			if(itr.next() == 2)
			list.add(3);
		}

	}

}
