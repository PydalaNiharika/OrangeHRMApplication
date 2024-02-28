package com.Inheratiance;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	static void reverse(Integer a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String[] args) {
		Integer arr[]= {10,20,30,40,50,60};
		reverse(arr);
		
		
		
		
	}
	
	
}
