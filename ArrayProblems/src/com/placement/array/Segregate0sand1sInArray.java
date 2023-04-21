package com.placement.array;
// here we will keep all zeros at left side and all 1's at right side. 
public class Segregate0sand1sInArray {

	static void method(int[] arr)
	{
		int j=0;
		for(int i=0 ; i<arr.length ;i++)
		{
			if(arr[i]==0)
				arr[j++]=arr[i];
		}
		while(j<arr.length)
			arr[j++]=1;
		for(int i=0 ; i<arr.length ;i++)
			System.out.print(arr[i] +",");
	}
	public static void main(String[] args) {
		int arr[]= {1,1,0,1,0,0,0,1,1,0};
		method(arr);
	}
}
