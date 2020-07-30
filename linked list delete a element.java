
import java.util.*;

class linkedlist_delete
{   
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next = null;
        }
    }
    Node head =null;
    public void insert(int d)
    {    Node new_node =new Node(d);
         if(head==null)
         {
             head=new_node;
         }
         else
         {
             Node present=head;
             while(present.next!=null)
             {
                 present=present.next;
             }
             present.next=new_node;
         }
    }
    public void disp()
    {
       Node present =head;
       System.out.println("New node elements after deletion are:");
           while(present !=null)
           {
               System.out.print(present.data+ " ");
               present=present.next;
           }
       
    }
    public void delete(int val)
    {    int flag=0;
        
         Node present=head;
         if(present.data==val)
         {
            head=present.next;
         }
         else{ 
               Node prev;
             while(present.next!=null)
             {   prev =present;
                 present=present.next;
                 if(present.data==val)
                {   prev.next=present.next;
                    flag=1;
                    break;
                }
             }
              if(flag==0)
              {
                  System.out.println("not found");
              }
              else{ 
                  disp();
              }
         }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of linked list:");
        int n=sc.nextInt();
        linkedlist_delete obj = new linkedlist_delete();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
          int val=sc.nextInt();
          obj.insert(val);
        }
        System.out.println("Enter the element to be deleted:");
        int val=sc.nextInt();
        obj.delete(val);
        sc.close();
                 
    }
}
