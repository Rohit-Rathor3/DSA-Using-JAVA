package algo.sorting.count;

public class CountSort {
	
	public static void countSort(int arr[])
	{
		int max= arr[0];
		// let find max element from the array
		for( int i=0;i<arr.length;i++) {
			if(max<arr[i])
			max=arr[i];
		}
		// let create new array of size max+1;
		int countArr[]= new int[max+1];
		
		// by default array is initialized with 0 value , so no need to initialize it explicitly.
		// let store value in count array
		for(int j=0;j<arr.length;j++) {
			countArr[arr[j]]=countArr[arr[j]]+1;
		}
		
		// let put sorted values into original arr from countArr
		int x=0;
		int y=0;
		while(x<countArr.length) {
			if(countArr[x]>0)
			{
				arr[y]=x;
				y++;
				countArr[x]--;

			}
			else
				x++;
		}
		
		// print the sorted array
		int z=0;
		while(z<arr.length)
		{
			System.out.print(arr[z]+" ");
			z++;
		}
	}
public static void main(String[] args) {
	int arr[]= {5,4,3,2,1,9,1};
	countSort(arr);
}
}
