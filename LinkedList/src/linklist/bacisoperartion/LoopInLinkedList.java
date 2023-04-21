// here, we will check whether there is loop or cycle in linked list or not.
package linklist.bacisoperartion;

import linklist.bacisoperartion.LinkedListOperations.Node;

public class LoopInLinkedList {

	// let create list 
	Node head;
	int size;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	// add node at first position
	public void addFirst(String data) {
		Node newNode=new  Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	// let create loop in list
	public void createLoop() {
		Node loop = head;
		for(int i=1;i<=size/2;i++) {
			if(i==size/2) {
				loop.next=head;
			}
			loop=loop.next;
		}
	}
	
	// let check our list has loop or cycle or not
	public boolean hasCycle() {
		Node slow = head;
		Node fast =head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LoopInLinkedList ll = new LoopInLinkedList();
		ll.addFirst("1");
		ll.addFirst("2");
		
		ll.addFirst("3");
		
		ll.addFirst("4");
		
		ll.addFirst("5");
		
		ll.addFirst("6");
		System.out.println("Before creating loop -->"+ll.hasCycle());
		// let create cycle
		ll.createLoop();
		System.out.println("After creating loop--> "+ll.hasCycle());
		
		
	}
}
