package com.placement.array;

public class FindSecondSmallestNumber {

	static void method(int arr[])
	{
		int small = Integer.MAX_VALUE;
		int secondSmall =Integer.MAX_VALUE;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]<small)
				small=arr[i];
			if(arr[i]>small && arr[i]<secondSmall)
				secondSmall =arr[i];
		}
		System.out.println("Second Smallest Number is :- "+secondSmall);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		method(arr);
	}
}
