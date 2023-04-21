// Deque , in this queue we can perform operations at both side front as well as from rear.
package com.queue.concept;

import java.util.Deque;
import java.util.LinkedList;

public class DequeQueue {
	public static void main(String[] args) {
		
		Deque<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.addLast(2);
		q.addFirst(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.removeFirst());
		}
		
		
		
	}

}
