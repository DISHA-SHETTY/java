package day5;

import java.util.Arrays;

public class ExampleThree {

	public static void main(String[] args) {
		int[] arr= {12,98,67,55,3};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("The largest element in the list is: "+max);
		// TODO Auto-generated method stub

	}

}
