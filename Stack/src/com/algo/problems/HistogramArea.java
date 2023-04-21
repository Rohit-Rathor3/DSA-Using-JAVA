package com.algo.problems;

import java.util.Stack;

public class HistogramArea {

	public static void maxArea(int arr[]) {
		int nsl[] = new int[arr.length]; // next samller left
		int nsr[] = new int[arr.length]; // next smaller right;
		Stack<Integer> s = new Stack<>();
		
		// find next smaller right
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[i]<=arr[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i]=arr.length;
			}
			else {
				nsr[i]=s.peek();
			}
			s.push(i);
		}
		
		// find next smaller left
		
		for(int j=0 ; j<arr.length;j++) {
			while(!s.isEmpty() && arr[j]<=arr[s.peek()]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				nsl[j] = -1;
			}
			else {
				nsl[j] =s.peek();
			}
			s.push(j);
		}
		
		// calculate area
		int max=0;
		for(int i=0 ; i<arr.length;i++) {
			int curr = arr[i]*(nsr[i]-nsl[i]-1);
			max=Math.max(max, curr);
		}
		
		System.out.println("Max area is "+ max);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,5,6,2,3};
		maxArea(arr);

	}

}
