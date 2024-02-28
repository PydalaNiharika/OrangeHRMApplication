package com.Inheratiance;


public class MissingArray {
	
	static int getMissingno(int a[],int n)
	{
		int i,total;
		total=(n+1)*(n+2)/2;
		
		for(i=0;i<n;i++)
			total -=a[i];
		
			return total;
			
	}
	public static void main(String[] args) {
		int a[]={1,2,4,5,6};
		int miss=getMissingno(a,5);
		System.out.println("The missing numbers:-"+miss);
	}
	
}
