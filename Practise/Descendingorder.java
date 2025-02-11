package Practise;

import java.util.Arrays;

import java.util.Collections;

public class Descendingorder {
	
	public static void main(String []args)
	{
		Integer a[]= {8,6,9,-10,0,7,2,4};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}

}
