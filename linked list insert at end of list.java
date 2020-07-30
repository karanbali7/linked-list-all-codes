import java.util.*;

class linkedlist_end
{
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
        data =d;
        next=null;
    }
    }
    public Node head =null;
   public void insert(int d)
   {
      Node new_node =new Node(d);
      if(head==null)
      {
      head =new_node;
      }
      else{
          Node last =head;
          while(last.next!=null)
          {
              last=last.next;
          }
          last.next=new_node;
      }

   }
   public void disp()
   {
      Node present = head;
      if(present==null)
      {
          System.out.print("empty");
      }
      else{System.out.println("elements are:");
          while(present !=null)
          {
              System.out.print(present.data+ " ");
              present=present.next;
          }
      }
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist_end in =new linkedlist_end();
        for(int i=0;i<n;i++)
        {
          int val=sc.nextInt();
          in.insert(val);
        }
        sc.close();
        in.disp();
    }
}