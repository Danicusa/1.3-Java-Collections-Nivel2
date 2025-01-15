package level2ex1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String answer = "";
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		Restaurant r1 = new Restaurant("Vivari", 5);
		Restaurant r2 = new Restaurant("Vivari", 6);
		Restaurant r3 = new Restaurant("Vivari", 5);
		
		restaurants.add(r1);
		restaurants.add(r3);
		restaurants.add(r2);
		
		Iterator<Restaurant> it1 = restaurants.iterator();
		
		while (it1.hasNext()) {
			System.out.println(it1.next().toString());
        }
	}
}

