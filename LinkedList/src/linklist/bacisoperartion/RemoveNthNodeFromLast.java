//Here, we will find the nth node from last and remove it.
package linklist.bacisoperartion;

import linklist.bacisoperartion.LinkedListOperations.Node;

public class RemoveNthNodeFromLast {

	// let create list of nodes.
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
	
	//let create our method to find nth node and remove it.
	public void removeNthFromLast(int n) {
		if(head.next==null) {
			System.out.println("Only one node found and deleted");
			head=null;
			return;
		}
		
		// remove sizeth node from last i.e head
		if(n==size) {
			head=head.next;
			return;
		}
		
		// find previoius node
		int ptf =size-n; // position to find
		Node prev = head;
		int cp=1; //current position
		while(cp!=ptf) {
			prev=prev.next;
			cp++;
		}
		prev.next=prev.next.next;
		
	}
	
	// method to print list
	public  void printList() {
		if(head==null) {
			System.out.println("List is emplty!!");
			return;
		}
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"-> ");
			currentNode=currentNode.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		RemoveNthNodeFromLast ll = new RemoveNthNodeFromLast();
		 ll.addFirst("Rathor"); /*ll.addFirst("Rohit"); ll.addFirst("a");
		 * ll.addFirst("is"); ll.addFirst("name"); ll.addFirst("My");
		 */		ll.printList();
		ll.removeNthFromLast(1);
		System.out.println();
		ll.printList();
		
	}
}
