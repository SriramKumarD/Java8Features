package java8features;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<HashMapCheck, Integer> map = new HashMap<HashMapCheck, Integer>();
		
		HashMapCheck obj1 = new HashMapCheck(1, "ram", "chennai");
	    HashMapCheck obj2 = new HashMapCheck(1, "ram", "chennai");
	    
	    map.put(obj1, 1);
	    map.put(obj2, 2);
	    
	    System.out.println("Map:"+map.size());
	    
	    obj1.setName("kumar");
	    
	    System.out.println("Map :" +map.get(obj1));
	    System.out.println("Map :" +map);
	    
	}

}

class HashMapCheck {
	
	
	int id;
	String name;
	String place;
	
	
	public HashMapCheck(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapCheck other = (HashMapCheck) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}
	
	
}
