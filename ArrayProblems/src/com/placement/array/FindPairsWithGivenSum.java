package com.placement.array;

public class FindPairsWithGivenSum {
	
	//This is two pointer approch method
	static void method1(int arr[],int sum)
	{
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{ 
			if((arr[low]+arr[high])>sum)
			{
				high--;
			}
			else if((arr[low]+arr[high])<sum)
			{
				low++;
			}
			else
			{
				System.out.println("pair"+"("+arr[low]+","+arr[high]+")");
				low++;
				high--;
			}
		}
		
		
	}
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7};
	int sum=9;
	method1(arr,sum);
	
}
}
