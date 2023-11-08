package Collections;

public class CircularLinkedlist {
    public class node{
    	int data;
    	node next;
    	public node(int data) {
    		this.data=data;
    	}
    }
    //declaring head and tail pointer as null
    public node head=null;
    public node tail=null;
    //this function will add the new node at the end of the list
    public void add(int data) {
    	//create new node
    	node newnode=new node(data);
    	//checks if the list is empty
    	if(head==null) {
    		//if list is empty,both head and tail would point to new node
    		head=newnode;
    		tail=newnode;
    		newnode.next=head;
    	}
    	else {
    		//tail will point to new node
    		tail.next=newnode;
    		//newnode will become new tail
    		tail=newnode;
    		//since,it is circular linked list tail will point to head
    		tail.next=head;
    	}
    }
    public void display() {
    	//displays all the node in the list
    	node current =head;
    	if(head==null) {
    		System.out.println("list is empty");
    		return;
    	}
    	else {
    		System.out.println("nodes of the circular linked list:");
    		do {
    			
    			System.out.print(" " +current.data);
    			current=current.next;
    		}while(current!= head);
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CircularLinkedlist cl=new CircularLinkedlist();
      //adds data to the list
      cl.add(1);
      cl.add(2);
      cl.add(3);
      cl.add(4);
      //displays all the nodes present in the list
      cl.display();
	}

}
