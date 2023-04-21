package com.placement.array;

import java.util.HashSet;
import java.util.Set;

// In this program we will find duplicate elements in array
public class DuplicateElements {
	static void method1(int arr[])
	{
		// using hit and trial method
		for(int i=0 ; i<arr.length-1;i++)
		{
			for(int j=i+1 ; j<arr.length ;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[i]);
				
			}
		}
	}
	
	static void method2(int arr[])
	{
		//using count method
		//first of all get largset number in array
		int max=arr[0];
		for(int i=1 ;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		int subArray[] =new int[max+1];
		for(int i=0;i<max;i++)
			subArray[i]=0;
		for(int i=0;i<arr.length;i++)
		{
			subArray[arr[i]]++;
		}
		for(int i=0 ; i<max;i++)
		{
			if(subArray[i]>1)
				System.out.println(i);
		}
		
	}
	
	//using hashset
	static void method3(int arr[])
	{
		Set<Integer> s =new HashSet();
		for(int i=0 ;i<arr.length;i++)
		{
			if(s.contains(arr[i]))
			{
				System.out.println(arr[i]);
			}
			else
			{
				s.add(arr[i]);
			}
		}
		
	}
public static void main(String[] args) {
	int arr[] = {1,2,4,1,5,2,1,3,4};
	System.out.println("Calling Method 1");
	method1(arr);
	System.out.println("Calling Method 2");
	method2(arr);
	System.out.println("Calling Method 3");
	method3(arr);
}
}
