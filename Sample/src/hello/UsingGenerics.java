package hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> items = new ArrayList<>();
		items.add("bang");
		items.add("mang");
		items.add("udupi");
		Iterator<String> itr =items.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		ListIterator<String> listIterator = null;
		//using for loop
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		for(String str : items)
			System.out.println(str);
	}
	

}
