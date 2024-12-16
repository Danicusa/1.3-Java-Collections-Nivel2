package tascas103level2ex2;

import java.util.Comparator;

import tascas103level2ex1.Restaurant;

public class SortedRestaurantList implements Comparator<Restaurant> {
	@Override
    public int compare(Restaurant r1, Restaurant r2) {
        
        int nameComparison = r1.getName().compareTo(r2.getName());
        if (nameComparison != 0) {
            return nameComparison; 
        }

        return Integer.compare(r2.getScore(), r1.getScore());
	}
}
