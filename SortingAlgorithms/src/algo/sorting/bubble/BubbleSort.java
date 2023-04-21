package algo.sorting.bubble;

public class BubbleSort {
   
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int[] bubbleSort(int arr[]) {
		if(arr.length==0)
			return new int[] {-1};
		
		for(int i=0 ; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int result[] = bubbleSort(arr);
		printArray(result);
		
	}
}
