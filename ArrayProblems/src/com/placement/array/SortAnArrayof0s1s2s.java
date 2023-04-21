package com.placement.array;

public class SortAnArrayof0s1s2s {

	static void method(int arr[])
	{
		int ones =0;
		int zeros =0;
		int twos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				zeros++;
			else if(arr[i]==1)
				ones++;
			else
				twos++;
		}
		for(int i=0 ;i<zeros ;i++)
			arr[i]=0;
		for(int j=zeros ;j<ones+zeros;j++)
			arr[j]=1;
		for(int k=ones+zeros;k<arr.length;k++)
			arr[k]=2;
		int m=0;
		while(m<arr.length)
		{
			System.out.println(arr[m]+" ");
			m++;
		}
	}
	
	// swapping method
	  public static void sort(int[] arr) {
		  
          int start = 0;
          int mid = 0;
          int high = arr.length - 1;

          while (mid <= high) {

              switch (arr[mid]) {
                  case 0: {
                     swap(arr, start, mid); 
                     start++;
                     mid++;
                     break;
                 }

                  case 1:
                     mid++;
                     break;

                  case 2: {
                     swap(arr, mid, high); 
                     high--;
                     break;
                  }
               }
            }
          System.out.println("----------------------------------------------------");
          int k=0;
          while(k<arr.length)
          {
        	  System.out.print(arr[k]+" ");
        	  k++;
          }
     }

     private static void swap(int[] arr, int start, int end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
    }
	public static void main(String[] args) {
		int arr[]= {2,2,0,1,2,1,1,0};
		method(arr);
		sort(arr);
	}
}
