package Collections;

import java.util.NoSuchElementException;
import java.util.Scanner;

class node
{
	protected int data;
	protected node link;
	public node()
	{
		link=null;
		data=0;
	}
	public node(int d,node n)
	{
		data=d;
		link=n;
	}
	public void setlink(node n)
	{
		link=n;
	}
	public void setdata(int d)
	{
		data=d;
	}
	public node getLink()
	{
		return link;
	}
	public int getdata()
	{
		return data;
	}
}
class linkedqueue
{
	protected node front,rear;
	public int size;
	public linkedqueue() {
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return front==null;
	}
	public int getsize()
	{
		return size;
	}
	public void insert(int data)
	{
		node nptr=new node(data,null);
		if(rear==null)
		{
			front=nptr;
			rear=nptr;
		}
		else
		{
			rear.setlink(nptr);
			rear=rear.getLink();
		}
		size++;
	}
	public int remove()
	{
		if(isEmpty())
			throw new NoSuchElementException("underflow exception");
		node ptr=front;
		front=ptr.getLink();
		if(front==null)
			rear=null;
		size--;
		return ptr.getdata();
	}
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("underflow exception");
		return front.getdata();
			
	}
	public void display()
	{
		System.out.print("\nqueue = ");
		if(size==0)
		{
			System.out.print("empty/n");
			return;
		}
		node ptr =front;
		while(ptr!=rear.getLink())
		{
			System.out.print(ptr.getdata()+" ");
			ptr=ptr.getLink();
		}
		System.out.println();
	}
}
public class LinkedQueueImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    linkedqueue lq=new linkedqueue();
    System.out.println("linked queue test\n");
    char ch;
    do
    {
    	System.out.println("\nqueue operations");
    	System.out.println("1.insert");
    	System.out.println("2.remove");
    	System.out.println("3.peek");
    	System.out.println("4.check empty");
    	System.out.println("5.size");
    	int choice =s.nextInt();
    	switch(choice)
    	{
    	case 1:
    		System.out.println("enter integer element to insert");
    		lq.insert(s.nextInt());
    		break;
    	case 2:
    		try
    		{
    			System.out.println("removed element="+lq.remove());
    		}
    		catch (Exception e)
    		{
    			System.out.println("erro : "+e.getMessage());
    		}
    		break;
    	case 3:
    		try
    		{
    			System.out.println("peek element="+lq.peek());
    		}
    		catch(Exception e)
    		{
    			System.out.println("erro : "+e.getMessage());
    			
    		}
    		break;
    	case 4:
    		System.out.println("empty status="+lq.isEmpty());
    		break;
    	case 5:
    		System.out.println("size ="+lq.getsize());
    		break;
    		default:
    			System.out.println("wrong entry \n ");
    			break;
    	}
    	lq.display();
    	System.out.println("\n do you want to continue (type y or n) \n");
    	ch=s.next().charAt(0);
    }while(ch =='Y'||ch=='y');
	}

}
