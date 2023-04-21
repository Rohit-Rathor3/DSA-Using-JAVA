// Here we use , LinkedList of collections given by Java people.
package linklist.bacisoperartion;

import java.util.LinkedList;

public class PredefineLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		// add methods
		ll.addFirst("Rathor");
		ll.addFirst("Rohit");
		ll.addLast("Software Engineer");
		
		// print list
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
			
		}
		System.out.println();
		// delete methods
		ll.removeFirst();
		ll.removeLast();
		
		
		System.out.println("After delete operation");
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
			
		}
	}
}
