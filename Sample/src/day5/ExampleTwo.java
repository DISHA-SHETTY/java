package day5;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleTwo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(200);
		list.add(90);
		System.out.println("the largest number in the list is "+Collections.max(list));

	}

}
