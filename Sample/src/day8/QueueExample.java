package day8;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("disha");
		queue.add("udupi");
		queue.add("manglore");
		queue.add("bang");
		queue.add("sigapore");
		System.out.println(queue);
		System.out.println(queue.remove());
		//System.out.println(queue.poll());
		System.out.println(queue);
		Iterator itr=queue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
