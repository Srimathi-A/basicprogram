package Collections;

public class SinglyLinkedlist {
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
	   node newnode= new node(data);
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
	   }
	   else {
		   tail.next=newnode;
		   tail=newnode;
	   }
	   
   }
   void addnodeBegining(int data) {
	   node newnode=new node(data);
	   if(head==null) {
		   head=newnode;
		   tail=newnode;
	   }
	   else {
		   newnode.next=head;
		   head=newnode;
	   }
   }
   void addnodeLast(int data) {
	   node newnode=new node(data);
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
  public void deleteFirst() {
	   node temp=head;
	   if(head==null) {
		   System.out.println("list is empty");
	   }
	   else {
		   head=head.next;
	   } 
   }
    public void deleteLast() {
	   node temp=head;
	    if(head==null) {
	    	System.out.println("list is empty");
	    }else {
	    		while(temp.next!=tail) {
	    			temp=temp.next;
	    		}
	    		temp.next=null;
	    		tail=temp;
	    	}
	    }
    public void deleteElement(int data) {
    	node temp=head;
    	if(head==null)
    		System.out.println("list is empty");
    	else {
    		if(temp.data==data) {
    			temp=temp.next;
    			head=temp;
    		}
    		else {
    			while(temp.next.data!=data) {
    				temp=temp.next;
    			}
    			if(temp.next==null)
    				System.out.println("elements is not present in the list");
    			else {
    				temp.next=temp.next.next;
    			}
    		}
    	}
    }
	   
   
  void print() {
	  node current=head;
	  if(head==null) 
		  System.out.println("the list is empty");
		  else {
			  while(current!=null) {
				System.out.println(current.data+ " ");  
				current=current.next;
			  }
			  System.out.println();
		  }
	  }
  
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SinglyLinkedlist s1=new SinglyLinkedlist();
       s1.addnode(2);
       s1.addnode(4);
       s1.addnodeBegining(6);
       s1.addnodeLast(10);
       s1 .addnode(12);
       s1.print();
       s1.deleteFirst();
       s1.deleteLast();
       s1.print();
      
	}

}
