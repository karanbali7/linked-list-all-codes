import java.util.*;
class linkedlist_beg
{   
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    public void insert(int val)
    {   Node new_node =new Node(val);
        if(head==null)
        {
            head=new_node;
        }
        else
        { 
              new_node.next=head;
              head=new_node;
        }
    }
    public void disp()
    {   System.out.println("elements in linked list:");
        Node present=head;
        while(present.next!=null)
        {
            System.out.print(present.data+" ");
            present=present.next;
        }System.out.println(present.data);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist_beg on= new linkedlist_beg();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            on.insert(val);
        }
        sc.close();
        on.disp();
    }
}