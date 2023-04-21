//  We can make queue using LinkedList and ArrayDeque provide by Java.
package com.queue.concept;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingCollection {

	public static void main(String[] args) {
		
		// Queue<Integer> q = new LinkedList<>();   using linkedlist
		Queue<Integer>  q = new ArrayDeque<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.remove();
		
		while(!q.isEmpty())
			System.out.println(q.remove());
		
		
	}
}
