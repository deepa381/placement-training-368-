import java.util.*;
class Node{
    int rollno;
    String name;
    Node next;
    Node prev;
    public Node(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
        this.next=null;
        this.prev=null;
    }
}
class LinkedList2{
    Node head;
    //insert at beginning
    Node insertBegin(int rollno,String name, Node head){
        Node nnode = new Node(rollno,name);
        nnode.next=head;
        if(head!=null)
            head.prev=nnode;
        return nnode;
    }
    Node insertend(int rollno,String name ,Node head){
        Node nnode=new Node(rollno,name);
        if(head==null){
            head=nnode;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=nnode;
        nnode.prev=cur;
        return head;
    }
    //display the list
    void display(Node head){
        if(head==null)
        {
        System.out.println("No records ");
        }
        while(head!=null){
            System.out.println("Roll No : " + head.rollno + " - Name : " + head.name);
            head=head.next;
        }
    }
    //insert at a position
    Node insertinpos(int rollno,String name, Node head,int pos)
    {
        Node nnode = new Node(rollno,name);
        if(head==null)
        return nnode; // new node

        if(pos==1){ 
            nnode.next=head;
            head.prev=nnode;
            return nnode;
        }
        Node temp=head;
        for(int i=1;temp!=null && i<pos-1;i++){
            temp=temp.next;
        }

        if(temp!=null){
            nnode.next=temp.next;
            nnode.prev=temp;//new code
            if(temp.next!=null)
                temp.next.prev=nnode;
            temp.next=nnode;
            nnode.prev=temp;
        }
        return head;
    }
    //delete at a position
    Node delete(int pos, Node head) {
        if (head == null)
            return head;
        if (pos == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;//new code
            }
            return head;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp.prev != null) {//new code
                temp.prev.next = temp.next;
            }
            if (temp.next != null) {//new code
                temp.next.prev = temp.prev;
            }
        }
        return head;
    }
    //  reverse the list
    Node reverse(Node head) {
        Node temp = null, curr = head;

        while (curr != null) {//complete new code
            temp = curr.next;
            curr.prev = curr.next;
            curr.next= temp;
            curr = curr.prev;
        }
        if (temp != null) {
                head=temp.prev; // Update the previous pointer of the new next node
            }
        return head;
    }
    //backward traversal
    void backwardTraversal(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println("Roll No : " + temp.rollno + " - Name : " + temp.name);
            temp = temp.prev;
        }
    }
    //delete from beginning
    Node deleteBegin(Node head) {
        if (head == null) {
            return null;
        }
        head= head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }
    //delete from end
    Node deleteEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }
    public static void main(String args[]){
        LinkedList2 lst=new LinkedList2();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Insert in beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Display records");
            System.out.println("5. Delete at position");
            System.out.println("6. Reverse the list");
            System.out.println("7. Backward Traversal");
            System.out.println("8. Delete from beginning");
            System.out.println("9. Delete from end");
            System.out.print("Enter your choice : ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. Insert in beginning");
                    System.out.print("Enter Rollno and Name : ");
                    lst.head=lst.insertBegin(sc.nextInt(),sc.next(),lst.head);
                    System.out.println("Record Inserted at the beginning");
                    break;
                case 2:
                    System.out.println("2. Insert at end");
                    System.out.print("Enter Rollno and Name : ");
                    lst.head=lst.insertend(sc.nextInt(),sc.next(),lst.head);
                    System.out.println("Record Inserted at the end");
                    break;
                case 3:
                    System.out.println("3. Insert at position");
                    System.out.print("Enter Rollno, Name and Position : ");
                    lst.head=lst.insertinpos(sc.nextInt(),sc.next(),lst.head,sc.nextInt());
                    System.out.println("Record Inserted at the specified position");
                    break;
                case 4:
                    System.out.println("4. Display records");
                    lst.display(lst.head);
                    break;
                case 5:
                    System.out.println("5. Delete at position");
                    System.out.print("Enter Position : ");
                    lst.head=lst.delete(sc.nextInt(),lst.head);
                    System.out.println("Record deleted at the specified position");
                    break;
                case 6:
                    System.out.println("6. Reverse the list");
                    lst.head=lst.reverse(lst.head);
                    System.out.println("List reversed");
                    break;
                case 7:
                    System.out.println("7. Backward Traversal");
                    lst.backwardTraversal(lst.head);
                    break;
                case 8:
                    System.out.println("8. Delete from beginning");
                    lst.head=lst.deleteBegin(lst.head);
                    System.out.println("Record deleted from the beginning");
                    break;
                case 9:
                    System.out.println("9. Delete from end");
                    lst.head=lst.deleteEnd(lst.head);
                    System.out.println("Record deleted from the end");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue (Y/N) : ");
        }while(sc.next().equalsIgnoreCase("Y"));
        
    }

}