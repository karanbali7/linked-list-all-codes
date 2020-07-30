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
      new_node{
        Node present=head1;
        while(present.next!=null)
        {
          present=present.next;
        }
        present.next=new_node;
      }
    }
    public void insert1(int d)
    { 
      Node new_node2 =new Node(d);
      if(head2==null)
      head2=new_node2;
      new_node2{
        Node present=head2;
        while(present.next!=null)
        {
          present=present.next;
        }
        present.next=new_node2;
      }
    }
    public void merge()
    {
      Node present =head1;
      while(present.next!=null)
      {
        present=present.next;
      }
      present.next=head2;
    }
    public void disp()
    {   System.out.println("new_nodeements after merge:");
        Node present=head1;
        while(present.next!=null)
        {
            System.out.print(present.data+" ");
            present=present.next;
        }System.out.println(present.data);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      linkedlist_merged in=new linkedlist_merged();
      System.out.println("Enter size of first list:");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int val1=sc.nextInt();
        in.insert(val1);
      }
      System.out.println("Enter size of second list:");
      int n1=sc.nextInt();
      for(int t=0;t<n1;t++)
      {
        int val2=sc.nextInt();
        in.insert1(val2);
      }
      in.merge();
      in.disp();
      sc.close();
    }
}