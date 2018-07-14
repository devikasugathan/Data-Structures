import java.util.*;
class node
{
	int info;
	node ptr;
	public node(int data)
	{
		this.info=data;
		this.ptr=null;
		
	}
}
public class Linkedlist {
	node head;
	public Linkedlist()
	{
		this.head=null;
	}
	public void add(int data){
		node first=new node(data);
		if(this.head==null)
		head=first;
		else
		{
		node temp;
		for(temp=this.head;temp.ptr!=null;temp=temp.ptr);
		temp.ptr=first;
		}
}
	public void print(){

		for(node first=this.head;first!=null;first=first.ptr){
		System.out.println(first.info);
		}
		

}
	public void deleteNode(int n) {

		if(head ==null){
		System.out.println("List is Empty");//Checks if Empty
		}
		if(head.info == n){
		head=head.ptr;
		}
		if(head == null){ // Check if there was only one element in list
		return;
		}
		node curr = head;
		while (curr.ptr != null) {
		if (curr.ptr.info == n) {
		curr.ptr= curr.ptr.ptr;
		} else {
		curr = curr.ptr;
		}
		}
		}

public static void main(String[] args){
	Linkedlist l = new Linkedlist();
	Scanner s = new Scanner(System.in);
	int n,p,c;
	int ch=1;
	while(ch==1)
	{
	System.out.println("Enter your choice 1:Insert 2:Delete 3:Print");
	c=s.nextInt();
	switch(c)
	{
	case 1:System.out.println("Enter the no:of elements to be inserted");
	       n=s.nextInt();
	         System.out.println("Enter the elements to be inserted");
	          for(int i=0;i<n;i++)
	            {p=s.nextInt();
	             l.add(p);
	             }
	          break;
	case 2:   System.out.println("Enter the element to be deleted");
              int re=s.nextInt();
              l.deleteNode(re);       
              break;	
              
	case 3:   System.out.println("The elements of linked list are:");
	          l.print();
       
	}
	System.out.println("Do yo want to continue Y=1 and N=0");
	 ch=s.nextInt();
	 
	}
    s.close();
}
}
