package Collections;

public class CircularLinkedlist1 {
     static class node{
    	 int data;
    	 node next;
     };
     static node addtoEmpty(node last,int data) {
    	 if(last!=null)
    		 return last;
    	 //allocate memory to the new node
    	 node newnode=new node();
    	 //assign data to the new node
    	 newnode.data=data;
    	 //assign last to new node
    	 last=newnode;
    	 //create link to itself
    	 newnode.next=last;
    	 return last;
    	 
     }
     static node addFront(node last,int data) {
    	 if(last==null)
    		 return addtoEmpty(last,data);
    	 node newnode=new node();
    	 newnode.data=data;
    	 newnode.next=last.next;
    	 last.next=newnode;
    	 return last;
     }
     static node addEnd(node last,int data) {
    	 if(last==null)
    		 return addtoEmpty(last,data);
    	 node newnode=new node();
    	 newnode.data=data;
    	 newnode.next=last.next;
    	 last.next=newnode;
    	 last=newnode;
    	 return last;
     }
     static node addAfter(node last,int data,int item) {
    	 if(last==null)
    		 return null;
    	 node newnode,p;
    	 p=last.next;
    	 do {
    		 if(p.data==item) {
    			 newnode=new node();
    			 newnode.data=data;
    			 newnode.next=p.next;
    			 p.next=newnode;
    			 if(p==last)
    				 last=newnode;
    			 return last;
    			 
    		 }
    		 p=p.next;
    	 }
    	 while(p!=last.next);
    	 System.out.println(item + "the given node is not present in the list");
    	 return last;
     }
     //delete a node
     static node deletenode(node last,int key) {
    	 if(last==null)
    		 return null;
    	 if(last.data==key && last.next==last) {
    		 last=null;
    		 return last;
    	 }
    	 node temp=last,d=new node();
    	 if(last.data==key) {
    		 while(temp.next!=last) {
    			 temp=temp.next;
    		 }
    		 //travel to the node to be deleted
    		 while(temp.next!=last && temp.next.data!=key) {
    			 temp=temp.next;
    		 }
    		 temp.next=last.next;
    		 last=temp.next;
    	 }
    	 while(temp.next!=last) {
    		 temp=temp.next;
    	 }
    		 //if node to be deleted was found
    		 if(temp.next.data==key) {
    			 d=temp.next;
    			 temp.next=d.next;
    		 }
    		 return last;
    	 }
     
     static void traverse(node last) {
    	 node p;
    	 if(last==null) {
    		 System.out.println("list is empty");
    		 return;
    	 }
    	 p=last.next;
    	 do {
    		 System.out.print(p.data + " ");
    		 p=p.next;
    	 }while(p!=last.next);
    	 System.out.println();
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       node last=null;
       last=addtoEmpty(last,6);
       last=addEnd(last,8);
       last=addFront(last,2);
       last=addAfter(last,10,2);
       last=addAfter(last,12,10);
       traverse(last);
       last=deletenode(last,10);
       traverse(last);
       
	}

}
