  
import java.util.*;
class linkedlist_merged
{   class Node
    {
      Node next;
      int data;
      Node(int d)
      {
        data=d;
        next=null;
      }
    }
    Node head1;
    Node head2;
    public void insert(int d)
    { 
      Node new_node =new Node(d);
      if(head1==null)
      head1=new_node;
      else{
        Node present=head1;
        while(present.next!=null)
        {
          present=present.next;
        }
        present.next=new_node;
      }
    }
    public void insert2(int d)
    { 
      Node new_node =new Node(d);
      if(head2==null)
      head2=new_node;
      else{
        Node present=head2;
        while(present.next!=null)
        {
          present=present.next;
        }
        present.next=new_node;
      }
    }
    public void merged()
    {
      Node present =head1;
      while(present.next!=null)
      {
        present=present.next;
      }
      present.next=head2;
    }
    public void disp()
    {   System.out.println("elements after merging:");
        Node present=head1;
        while(present.next!=null)
        {
            System.out.print(present.data+" ");
            present=present.next;
        }
         System.out.println(present.data);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      linkedlist_merged in=new linkedlist_merged();
      System.out.println("Enter size of first linked lst:");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int val1=sc.nextInt();
        in.insert(val1);
      }
      System.out.println("Enter size of second linked list:");
      int n2=sc.nextInt();
      for(int t=0;t<n2;t++)
      {
        int val2=sc.nextInt();
        in.insert2(val2);
      }
      in.merged();
      in.disp();
      sc.close();
    }
}