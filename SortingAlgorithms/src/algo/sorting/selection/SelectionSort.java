package algo.sorting.selection;

public class SelectionSort {

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int[] selectionSort(int arr[]) {
		if(arr.length==0) {
			return new int[] {-1};
		}
		
		// logic
		for(int i=0;i<arr.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index]>arr[j]) {
					min_index=j;
				}
			}
			//swap
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		int arr[] = {5,4,3,2,1};
		int result[] = selectionSort(arr);
		printArray(result);

	}

}
