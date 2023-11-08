package Collections;

public class DoublyLinkedlist {
     class node{
    	 public int data;
    	 public node next=null;
    	 public node prev=null;
    	 public node(int data)
    	 {
    		 this.data=data;
    	 }
     }
     // to represent the head of a doubly linked list
     node head = null;
     // to represent the tail of a doubly linked list
     node tail=null;
     public void addnodeFront(int val) {
    	 node temp= new node(val);
    	 if(head!=null)
    	 {
    		 head.prev=temp;
    		 temp.next=head;
    	 }
    	 head=temp;
    	 if(tail==null)
    	 tail=temp; 
    	    }
     public void addnodeBack(int val) {
    	 node temp=new node(val);
    	 if(tail!=null) {
    		 tail.next=temp;
    		 temp.prev=tail;
    	 }
    	 tail=temp;
    	 if(head==null) {
    		 head=temp;
    	 }
    	 System.out.println("new node added at the end :" +val);
     }
     public void removenodeFront() {
    	 node temp=head;
    	 head=head.next;
    	 head.prev=null;
    	 System.out.println("deleted : "+ temp.data);
          //return temp.data;
     }
     public void removenodeBack() {
    	 node temp=tail;
    	 tail=tail.prev;
    	 tail.next=null;
    	 System.out.println("deleted: "+temp.data);
     }
     public void iteratorForward() {
    	 node temp=head;
    	 while(temp !=null) {
    		 System.out.println(temp.data);
    		 temp=temp.next;
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DoublyLinkedlist dll= new DoublyLinkedlist();
        dll.addnodeFront(2);
        dll.addnodeFront(100);
        dll.addnodeBack(1200);
        dll.addnodeBack(2000);
        dll.addnodeBack(500);
        System.out.println("doubly linked list before remove: ");
        dll.iteratorForward();
        dll.removenodeFront();
        System.out.println("doubly linked list after remove front:");
        dll.iteratorForward();
        dll.removenodeBack();
        System.out.println("doubly linked list after remove back: ");
        dll.iteratorForward();
	}

}
