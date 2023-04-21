//Here, we will perform basic linkedlist operations  

package linklist.bacisoperartion;



public class LinkedListOperations{
	
	Node head;
	int size;
	
	LinkedListOperations(){
		this.size=0;
		
	}
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
	
	//add node at middle , given index
	public void addInMiddle(int index, String data) {
		if(index>size || index<0)
		{
			System.out.println("Invalid Index number");
			return;
		}
		Node newNode = new Node(data);
		 if(head==null || index==0) {
			 newNode.next = head;
			 head=newNode;
			 return;
		 }
		 
		 Node currNode = head;
		 for(int i=1;i<size;i++) {
			 if(i==index) {
				 Node nextNode= currNode.next;
				 currNode.next=newNode;
				 newNode.next=nextNode;
				 break;
			 }
			 currNode=currNode.next;
		 }
	}
	
	//add node at last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node lastNode=head;
		 while(lastNode.next!=null) {
			 lastNode=lastNode.next;
		 }
		 lastNode.next=newNode;
	}
	
	// print whole list
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
	
	//delete first node
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is empty!!");
			return;
		}
		head=head.next;
		size--;
	}
	
	// delete lastNode
	public void removeLast() {
		if(head==null) {
			System.out.println("List is empty!!");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node currentNode=head;
		Node lastNode = head.next;
		while(lastNode.next!=null) {
			currentNode=currentNode.next;
			lastNode=lastNode.next;
		}
		
		currentNode.next=null;
	}
	
	// get size of linkedlist
	public int getSize() {
		return size;
	}
	
	
	
   public static void main(String[] args) {
	// let insert and delete data to list
	   LinkedListOperations ll=new LinkedListOperations();
	   ll.addFirst("Rohit");
	   ll.addFirst("Name");
	   ll.addFirst("My");
	   ll.addLast("Rathor");
	   ll.addInMiddle(2, "is");
	   ll.removeFirst();
	   ll.removeLast();
	   ll.printList();
	  
}
}
