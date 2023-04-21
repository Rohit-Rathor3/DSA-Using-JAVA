package com.placement.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedArray {
	
	static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
  
		int k=0;
		while(k<arr.length)
		{
			System.out.println(arr[k] + " ");
			k++;
		}
	}
// Using sorting
	static void method1(int[] arr)
	{
		Arrays.sort(arr);
		int j=0;
		for(int i=0 ;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		}
		arr[j++]=arr[arr.length-1];
		int k=0;
		while(k<j)
		{
			System.out.println(arr[k]);
			k++;
		}
	}
	
	// using hashmap
	static void method2(int arr[])
	{
		HashMap<Integer,Integer> hm =new HashMap();
		for(int i=0 ;i<arr.length-1 ;i++)
		{
			if(hm.containsValue(arr[i]))
				hm.put(arr[i],hm.get(arr[i]+1));
			else
				hm.put(arr[i], 1);
		}
		hm.forEach((k,v)->System.out.println(k+ " "));
	}
	
	//using set
	static void method3(int[] arr)
	{
		Set<Integer> s =new HashSet();
		for(int i=0 ; i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		s.forEach(elm->System.out.println(elm +" "));
			
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,6,6};
		//method1(arr);
		//method2(arr);
		//method3(arr);
		int arr1[] = {5,4,3,2,1};
		bubbleSort(arr1);
		
	}
}
