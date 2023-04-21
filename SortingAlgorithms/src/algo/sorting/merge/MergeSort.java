package algo.sorting.merge;

public class MergeSort {

	public static void divide(int[] arr , int startIndx,int endIndx) {
		if(startIndx>=endIndx)
			return;
		int mid = startIndx+(endIndx-startIndx)/2; // or (startIndx+endIndx)/2
		divide(arr,startIndx,mid);
		divide(arr,mid+1,endIndx);
		conqure(arr,startIndx,mid,endIndx);
	}
	
	public static void conqure(int[] arr, int startIndx,int mid, int endIndx) {
		int merged[]=new int[endIndx-startIndx+1];
		int indx1= startIndx;
		int indx2=mid+1;
		int x=0;
		while(indx1<=mid && indx2<=endIndx) {
			if(arr[indx1]<=arr[indx2])
				merged[x++]=arr[indx1++];
			else
				merged[x++]=arr[indx2++];
		}
		
		while(indx1<=mid)
			merged[x++]=arr[indx1++];
		while(indx2<=endIndx)
			merged[x++]=arr[indx2++];
		
		for(int i=0,j=startIndx;i<merged.length;i++,j++)
			arr[j]=merged[i];
	}
	
	//print array
	public static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) 
		System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		divide(arr,0,4);
		printArray(arr);
	}
}
