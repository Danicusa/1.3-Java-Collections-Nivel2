package level2ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import level2ex1.Restaurant;

public class Main {

	public static void main(String[] args) {
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		Restaurant r1 = new Restaurant("Vivari", 5);
		Restaurant r2 = new Restaurant("Vivari", 6);
		Restaurant r3 = new Restaurant("Atlantis", 7);
		Restaurant r4 = new Restaurant("McDonalds", 6);
		
		restaurants.add(r1);
		restaurants.add(r2);
		restaurants.add(r3);
		restaurants.add(r4);
		
		List<Restaurant> restaurantList = new ArrayList<>(restaurants);
		Collections.sort(restaurantList, new SortedRestaurantList());
		
		restaurantList.forEach(r -> System.out.println(r));

	}

}
