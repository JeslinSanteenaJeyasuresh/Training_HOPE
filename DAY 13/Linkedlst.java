class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head,temp;
    public void InsertAtStart(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void InsertAtLast(int data){
        temp=head;
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }
    public void display(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void deleteAtStart(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deleteAtend(){
        temp=head;
        if(temp==null)return;
        if(temp.next==null){
            temp=null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void InsertAtPosition(int pos,int data){
        if(pos==0){
            InsertAtStart(data);
            return;
        }
        temp=head;
        Node newnode=new Node(data);
        int loc=0;
        while(loc<pos-1){
            temp=temp.next;
            loc++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void DeleteAtPosition(int pos){
        if(head==null)return;
        if(pos==0)head=head.next;
        temp=head;
        int loc=0;
        while(loc<=pos-1){
            temp=temp.next;
            loc++;
            
        }
        temp.next=null;
    }
}
public class Linkedlst {
    public static void main(String[] args){
        LinkedList lst=new LinkedList();
        lst.InsertAtStart(20);
        lst.InsertAtLast(21);
        lst.InsertAtLast(22);
        lst.InsertAtLast(23);
        lst.InsertAtLast(24);
        lst.DeleteAtPosition(3);
        lst.display();
    }
}
