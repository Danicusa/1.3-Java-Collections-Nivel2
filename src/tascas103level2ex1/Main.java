package tascas103level2ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import tascas103level2ex2.SortedRestaurantList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		Restaurant r1 = new Restaurant("Vivari", 5);
		Restaurant r2 = new Restaurant("Vivari", 6);
		Restaurant r3 = new Restaurant("Atlantis", 7);
		Restaurant r4 = new Restaurant("McDonalds", 6);
		restaurants.add(r1);
		restaurants.add(r1);
		restaurants.add(r2);
		
		Iterator<Restaurant> it1 = restaurants.iterator();
		
		while (it1.hasNext()) {
			System.out.println(it1.next().toString());
        }
	}
}

