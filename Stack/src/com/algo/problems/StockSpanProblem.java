// Here, we will find maximum no. of consecutive days for which price<=today's price.

package com.algo.problems;

import java.util.Stack;

public class StockSpanProblem {

	 
	public static void stockSpan(int stokes[], int span[]) {
		Stack<Integer> s = new Stack<>();
		span[0]=1;
		s.push(0);
		
		for(int i=1; i<stokes.length;i++) {
			int curr = stokes[i];
			while(!s.isEmpty() && curr>stokes[s.peek()]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				span[i]=i+1;
			}
			else {
				int prevHigh = s.peek();
				span[i]=i-prevHigh;
			}
			s.push(i);
		}
	}
	
	public static void main(String[] args) {
		
  int  stockes[] = {100,80,60,70,60,85,100};
  int span[]=new int[stockes.length];
  stockSpan(stockes,span);
  
  for(int i=0;i<span.length;i++) {
	  System.out.println(span[i]);
  }
  
	}
}
