import java.util.*;
class Node {
int data;
Node next;
Node prev;

public Node (int data) {
  this.data = data;
  this.next = null;
  this.prev = null;
  }
}

class Doubly{
  Node head;
  public Doubly(){
    this.head = null;
    }

    public void print(){
      Node temp;
      for(temp = this.head;temp != null;temp = temp.next){
        System.out.println(temp.data);
      }
   }
   public void insfront(int data) {
     Node newnode= new Node (data);
     if(head!=null) {
       head.prev=newnode;
     }
     newnode.next=head;
     head=newnode;
   }

   public void inslast (int data) {
     Node newnode = new Node (data);
     Node temp;
     if(head==null){
       head=newnode;
     }
     for(temp = this.head; temp.next != null;temp = temp.next);
     temp.next=newnode;
     temp.prev=temp;
   }

   public void inspos(int data,int pos) {
     Node temp=this.head;
     int i=1;
     Node newnode = new Node (data);
     if(head==null && pos==1) {
     head=newnode;
     return;
      }
      if (head==null && pos!=1){
        System.out.println("Please enter a valid position");
        return;
      }
      if(head!=null && pos==1) {
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return;
      }

      while(i<pos-1 && temp!=null) {
        temp=temp.next;
        i++;
      }
      if(i==pos-1) {
        if(temp.next!=null) {
          newnode.next=temp.next;
          temp.next.prev=newnode;
        }
          temp.next=newnode;
          newnode.prev=temp;
        }
        else
        System.out.println("Invalid ");
      }

      public void delfront() {
        head=head.next;
        head.prev=null;
      }

      public void dellast() {
        Node temp;
        for(temp = this.head; temp.next.next != null;temp=temp.next);
        temp.next=null;
      }

      public void delpos(int pos) {
        Node temp = head;
        if(head == null)
          return;
        if (pos == 0) {
          head = temp.next;
          return;
        }
        for(int i = 0; temp != null && i < pos-2; i++) {
          temp = temp.next;
        }
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
      }
   }
	 class DoublyLink {
  public static void main(String[] args) {
    Doubly l  = new Doubly();
		Scanner m = new Scanner(System.in);
		int ch =1;
		while(ch==1){
		System.out.println("Enter the choice 1. Insert at first 2.Insert at end 3.Insert at pos 4.Print 5.Delete at front 6.Delete at End 7.Delete at pos");

		int c =m.nextInt();
		switch(c)
		{
			case 1:System.out.println("Enter the element");
						 int r= m.nextInt();
						 l.insfront(r);
						 break;
			case 2:System.out.println("Enter the element");
						 int p= m.nextInt();
						 l.inslast(p);
						 break;
				case 3:System.out.println("Enter the element");
			       int q= m.nextInt();
						 System.out.println("Enter the position");
						 int w= m.nextInt();
						 l.inspos(q,w);
						 break;
			case 4:l.print();
						 break;

			case 5:l.delfront();
						 break;
			case 6:l.dellast();
						 break;
			case 7:System.out.println("Enter the element");
						 int h= m.nextInt();
						 l.delpos(h);
						 break;


		}
		System.out.println("Do you want to continue 1.Yes 0.No");
		 ch=m.nextInt();
	}
}
}
