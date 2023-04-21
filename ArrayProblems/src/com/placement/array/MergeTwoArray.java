package com.placement.array;

public class MergeTwoArray {

	
	static void method(int arr1[] , int arr2[])
	{
		int arr1_len =arr1.length;
		int arr2_len =arr2.length;
		int result[] = new int[arr1_len+arr2_len];
		int i=0 , j=0 ,k=0;
		while(i<arr1_len && j<arr2_len)
		{
			if(arr1[i]<arr2[j])
				result[k++]=arr1[i++];
			else
				result[k++]=arr2[j++];
			
		}
		while(i<arr1_len)
			result[k++]=arr1[i++];
		while(j<arr2_len)
			result[k++]=arr2[j++];
		
		for(int x=0 ;x<result.length ;x++)
			System.out.print(result[x]+" ");
		
	}
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};
		method(arr1,arr2);
	}
}
