package algo.search.linear;

public class LinearSearch {
	public static int linearSearch(int arr[],int targetElem) {
		if(arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==targetElem)
				return i;
		}
		return -1;
	}
public static void main(String[] args) {
	
	int arr[]= {1,4,6,9,3,5};
	int targetElem =3;
	int result=linearSearch(arr,targetElem);
	if(result==-1)
		System.out.println("Target element not found!!");
	else
		System.out.println("Element found at index "+result);
}
}
