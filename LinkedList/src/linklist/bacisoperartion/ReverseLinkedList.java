// here we will reverse the list
package linklist.bacisoperartion;

import linklist.bacisoperartion.LinkedListOperations.Node;

public class ReverseLinkedList {

	// let create the linkded list
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
	
	// let reverse the list
	public Node reverseList() {
		Node prev=null;
		Node curr = head;
		while(curr!=null) {
			Node next = curr.next;
			curr.next =prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	// print whole list
		public  void printList(Node head) {
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
			System.out.println();
		}
		
		public static void main(String[] args) {
			ReverseLinkedList ll = new ReverseLinkedList();
			ll.addFirst("1");
			ll.addFirst("2");
			ll.addFirst("3");
			ll.addFirst("4");
			ll.addFirst("5");
			System.out.println("List before reverse");
			ll.printList(ll.head);
			System.out.println("List after reverse");
			ll.printList(ll.reverseList());
		}
	
}
