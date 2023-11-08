package basicprogram;

public class SinglyLinkedList {
   class node{
	   int data;
	   node next;
	   public node(int data) {
		   this.data=data;
		   this.next=null;
	   }
   }
   public node head=null;
   public node tail=null;
   void addnode(int data) {
	   node newnode=new node(data);
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
	   }
	   else {
		   tail.next=newnode;
		   tail=newnode;
	   }
   }
   void addFirst(int data) {
	   node newnode= new node(data);
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
	   }
	   else {
		   newnode.next=head;
		   head=newnode;
	   }
   }
   void addLast(int data) {
	   node newnode = new node(data);
	   node current=head;
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
   }
	   else {
		   while(current.next!=null) {
			   current=current.next;
		   }
		   current.next=newnode;
	   }
   }
   void addBetween(int pos,int  data) {
	   node newnode=new node (data);
	   node current=head;
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
   }
	   else {
		 while(current.data!=pos) {
			 current=current.next;
		 }
		// current.next=newnode;
		newnode.next=current.next;
		current.next=newnode;
		
	   }
   }
   public void display() {
	   node current =head;
	   if(head==null) {
		   System.out.println("Linked list is empty");
	   }
	   else {
		   System.out.println("singly linked list elements are: ");
		   while(current!=null) {
			 System.out.print(current.data+" ");
			 current =current.next;
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SinglyLinkedList sll = new SinglyLinkedList();
       sll.addnode(10);
       sll.addnode(5);
       sll.addnode(20);
       sll.addFirst(100);
       sll.addLast(200);
       sll.addBetween(5, 50);
       sll.display();
	}

}
