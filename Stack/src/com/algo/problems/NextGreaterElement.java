// Here,we will find next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
package com.algo.problems;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int arr[]= {6,8,0,1,3};
		int nextGreater[]=new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nextGreater[i]=-1;
			}
			else {
				nextGreater[i]=arr[s.peek()];
			}
			s.push(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(nextGreater[i]);
		}
	}
}
