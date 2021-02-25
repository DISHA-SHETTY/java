package hello;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExOne {

	
	public static void main(String[] args) {
		
		ArrayList items=new ArrayList();
		// TODO Auto-generated method stub
		items.add("udupi");
		items.add("50");
		items.add("c");
		items.add("10.70");
		items.add("bangalore");
		items.add("cap");
		items.add(null);
		System.out.println(items+" "+items.size());
		items.remove(4);
		System.out.println(items+" "+items.size());
		Iterator itr=items.listIterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			if(obj instanceof Integer)
			
				System.out.println(obj);
			}
		}
			
			
			
	
	}


