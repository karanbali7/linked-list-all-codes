import java.util.*;

class linkedlist_find
{   class Node
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
    public void insert(int d)
    {
         Node new_node=new Node(d);
         if(head==null)
         {
           head=new_node;
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
    public void find(int a)
    {   int flag=0;
        Node present=head;
        int i=1;
        while(present.next!=null)
        {
            if(present.data==k)
            {   flag=1;
                break;
            }
            i++;
            present=present.next;
        }
        if(present.data==a)
        flag=1;
        
        if(flag==1)
        {
            System.out.println("found at position: "+i);
        }
        else{
            System.out.println("not found");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        linkedlist_find in =new linkedlist_find();
        for(int i=0;i<n;i++)
        {
            int val =sc.nextInt();
            in.insert(val);
        }
        
        System.out.println("enter element to find:");
        int a=sc.nextInt();
        in.find(a);
        sc.close();
    }
}