package level1ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {		
		List<Integer> list1 = new ArrayList <Integer>();	
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList <Integer>();	
		
		ListIterator<Integer> it1 = list1.listIterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		while (it1.hasPrevious()) {
			list2.add(it1.previous());
		}
	
		ListIterator<Integer> it2 = list2.listIterator();
		
		System.out.println("\n");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
