package day8;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk=new Stack<>();
		stk.add("banglore");
		stk.add("manglore");
		stk.add("udupi");
		stk.add("shimoga");
		//System.out.println(stk.pop());
		System.out.println(stk.peek());
		stk.push("karnataka");
		System.out.println(stk);
		Iterator itr =stk.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		stk.forEach((e)->{System.out.println(e);
		});

	}

}
