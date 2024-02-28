package com.Inheratiance;

public class MissingArrays {
	
	
static int getMissingNumber(int a[],int n) {
	int i,total;
	total=(n+1)*(n+2)/2;
	
	
	
	for(i=0;i<n;i++)
		 n=a[i];
		return total;
	
	
}
	
	
	
	
public static void main(String[] args) {
	
	
	int a[]= {1,2,3,5,6};
	
	int miss=getMissingNumber(a, 5);
	System.out.println(miss);
	
}
}
