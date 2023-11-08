package basicprogram;

import java.util.LinkedList;

public class SLL {
    class node{
    	int data;
    	node next;
    	node(int d) {
    		data = d;
    		next = null;
    	}
    }
    public node head=null;
    // insert at the beginning
    public void insertAtBeginning(int new_data) {
    	// insert the data
    	node new_node=new node(new_data);
    	new_node.next=head;
    	head=new_node;
    }
    // insert after a node
    public void insertAfter(node prev_node,int new_data) {
    if(prev_node==null) {
    	System.out.println("The given previous node cannot be null");
    	return;
    }
    node new_node=new node(new_data);
    new_node.next=prev_node.next;
    prev_node.next=new_node;
    }
    // insert at the end
    public void insertAtEnd(int new_data) {
    	node new_node=new node(new_data);
    	if(head==null) {
    		head=new node(new_data);
    		return;
    	}
    	new_node.next=null;
    	node last=head;
    	while(last.next!=null)
    		last=last.next;
    	last.next=new_node;
    	return;
    }
    //delete a node
    void deletenode(int position) {
    	if(head==null)
    		return;
    	node temp = head;
    	if(position==0) {
    		head=temp.next;
    		return;
    	}
    	// find the key to be deleted
    	for(int i=0;temp!=null&&i<position-1;i++)
    		temp=temp.next;
    	// if the key is not present
    	if(temp==null || temp.next==null)
    		return;
    	// remove the node
    	node next=temp.next.next;
    	temp.next=next;
    }
    // search a node
    boolean search(node head,int key) {
    	node current=head;
    	while(current !=null) {
    		if(current.data==key)
    			return true;
    		current = current.next;
    	}
    	return false;
    }
    // sort the linked list
    void sortlinkedlist(node head) {
    	node current=head;
    	node index= null;
    	int temp;
    	if(head==null) {
    		return;		
    	}else {
    		while(current!=null) {
    			//index points to the node next to current
    			index=current.next;
    			while(index !=null) {
    				if(current.data>index.data) {
    					temp=current.data;
    					current.data=index.data;
    					index.data=temp;
    				}
    				index=index.next;
    			}
    			current=current.next;
    		}
    	}
    }
    //print the linked list
    public void printlist() {
    	node tnode=head;
    	while(tnode!=null) {
    		System.out.print(tnode.data+" ");
    		tnode=tnode.next;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SLL list = new SLL();
    list.insertAtEnd(1);
    list.insertAtBeginning(2);
    list.insertAtBeginning(3);
    list.insertAtEnd(4);
    list.insertAfter(list.head.next,5);
    System.out.println("Linkedlist: ");
    list.printlist();
    System.out.println();
    int item_to_find=3;
    if(list.search(list.head,item_to_find))
    	System.out.println(item_to_find+"is found");
    else
    	System.out.println(item_to_find+"is not found");
    list.sortlinkedlist(list.head);
    System.out.println("\n sorted list: ");
    list.printlist();
    
    
	}

}
