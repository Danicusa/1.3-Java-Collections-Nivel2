package level1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<Month>();
		
		months.add(new Month("January"));
		months.add(new Month("February"));
		months.add(new Month("March"));
		months.add(new Month("April"));
		months.add(new Month("May"));
		months.add(new Month("June"));
		months.add(new Month("June"));
		months.add(new Month("September"));
		months.add(new Month("October"));
;		months.add(new Month("November"));
		months.add(new Month("December"));
		
		Iterator<Month> it1 = months.iterator();
		
		while(it1.hasNext()) {
			String name = it1.next().getName();
			System.out.println(name);
		}
		
		months.add(7, new Month("August"));
		Iterator<Month> it2 = months.iterator();
		
		System.out.println("\n");
		while(it2.hasNext()) {
			String name = it2.next().getName();
			System.out.println(name);
		}
		
		HashSet<Month> hash1 = new HashSet<Month>(months);
		hash1.add(new Month("June"));
		Iterator<Month> it3 = hash1.iterator();
		
		System.out.println("\n");
		System.out.println("ITERATOR:");
		while(it3.hasNext()) {
			String name = it3.next().getName();
			System.out.println(name);
		}
		
		System.out.println("\n");
		System.out.println("FOR:");
		for(Month month : hash1) {
			System.out.println(month.getName());
		}
	}
}
