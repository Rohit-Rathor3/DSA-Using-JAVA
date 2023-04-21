package algo.sorting.quick;

public class QuickSort {

	// partition method , will return index of pivot element
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		// now swap pivot element;
		i++;
		int temp = arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
	
	// Quick sort
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivot_index = partition(arr,low,high);
			quickSort(arr,low,pivot_index-1);
			quickSort(arr,pivot_index+1,high);
		}
	}
	
	// print array
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {5,4,3,2,1};
		
		quickSort(arr,0,arr.length-1);
		printArray(arr);

	}

}
