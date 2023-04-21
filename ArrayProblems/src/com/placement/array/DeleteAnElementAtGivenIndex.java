package com.placement.array;

public class DeleteAnElementAtGivenIndex {

	static void method(int arr[],int index)
	{
		for(int i=index ;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<arr.length-1;i++)
		{
		System.out.println(	arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int index= 4;
		method(arr,index);
		
		
}
}