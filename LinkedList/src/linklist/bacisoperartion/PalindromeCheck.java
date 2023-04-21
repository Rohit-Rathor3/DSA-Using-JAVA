package linklist.bacisoperartion;

import javax.swing.text.PlainDocument;

import linklist.bacisoperartion.LinkedListOperations.Node;

public class PalindromeCheck {

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
	
	//find middle of list
	public Node getMiddle(Node head) {
		System.out.println("PalindromeCheck.getMiddle()");
		Node hare = head;
		Node turtle = head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle=turtle.next;
		}
		return turtle;
	}
	
	// reverse the list
	public Node reverse(Node head) {
		System.out.println("PalindromeCheck.reverse()");
		Node prev=null;
		Node curr =head;
		while(curr!=null) {
			Node nextNode = curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		return prev;
	}
	
	// check palindrome or not
	public boolean isPalindrome(Node head) {
		System.out.println("PalindromeCheck.isPalindrome()");
		if(head==null || head.next==null)
			return true;
		
		Node fhe = getMiddle(head); // first half end
		Node shs = reverse(fhe.next);    // second half start
		Node fhs = head;   // first half start
		while(shs!=null) {
			if(shs.data!=fhs.data)
				return false;
			shs=shs.next;
			fhs=fhs.next;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
	PalindromeCheck ll = new PalindromeCheck();
	ll.addFirst("P");
	ll.addFirst("O");
	ll.addFirst("O");
	ll.addFirst("P");
	boolean flag = ll.isPalindrome(ll.head);
	if(flag)
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	
	}
}
