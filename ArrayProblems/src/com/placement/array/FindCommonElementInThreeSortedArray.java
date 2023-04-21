package com.placement.array;

public class FindCommonElementInThreeSortedArray {

	
	//hit and trial method --> Time complexity --> O(n3);
	static void method1(int[] arr1, int arr2[], int arr3[])
	{
		for(int x=0 ; x<arr1.length;x++)
		{
			for(int y=0; y<arr2.length; y++)
			{
				for(int z=0;z<arr3.length; z++)
				{
					if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
					{
						System.out.println(arr1[x]);
					}
				}
			}
		}
	}
	
	// Three pointer approch
	static void method2(int arr1[], int arr2[] ,int arr3[])
	{
		int x=0 ,y=0 ,z=0;
		while(x<arr1.length && y<arr2.length && z<arr3.length)
		{
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
			{  
				System.out.println(arr1[x]);
				x++;y++;z++;	
			}
			else if(arr1[x]>arr2[y])
				y++;
			else if(arr2[y]>arr3[z])
				z++;
			else
				x++;
		}
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8,9};
		int arr2[]= {5,6,7,8,9,10};
		int arr3[]= {6,7,8,9,10,11,12};
		System.out.println("Calling Method 1");
		method1(arr1,arr2,arr3);
		System.out.println("Calling Method 2");
		method2(arr1,arr2,arr3);
		}
}
