package algo.search.binary;

public class BinarySearch {

	public static int binarySearch(int arr[],int targetElem) {
		if(arr.length==0)
			return -1;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==targetElem)
				return mid;
			else if(targetElem>arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		 // array must be sorted
		int arr[]= {1,3,5,7,9};
		int targetElem = 7;
		int result=binarySearch(arr, targetElem);
		if(result!=-1)
			System.out.println("ELement found at index "+result);
		else
			System.out.println("Element not found!");
		}
  
	}

 