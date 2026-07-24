import java.util.Scanner;
class Node{
    int rollno;
    String name;
    Node next;
    public Node(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
        this.next=null;
    }
}
class LinkedList1{
    Node head;
    Node insertBegin(int rollno,String name, Node head){
        Node nnode = new Node(rollno,name);
        nnode.next=head;
        return nnode;
    }
    Node insertEnd(int rollno,String name, Node head){
    Node nnode = new Node(rollno,name);
    if(head==null)
    return nnode; // creating first node (head node)
    Node cur=head;
    while(cur.next!=null){
        cur=cur.next;
    }
    cur.next=nnode;// creating from second node...
    return head;
    }
    Node insertPos(int rollno,String name, Node head,int pos)
    {
        Node nnode = new Node(rollno,name);
        if(head==null)
        return nnode; // creating first node (head node)

        if(pos==1){ // use login of insertBegin
            nnode.next=head;
            return nnode;
        }
        Node temp=head;
        for(int i=1;temp!=null && i<pos-1;i++){
            temp=temp.next;
        }

        if(temp!=null){
            nnode.next=temp.next;
            temp.next=nnode;
        }
        return head;
    }
    void display(Node head){
        if(head==null)
        {
        System.out.println("No records ");
        return;
        }
        while(head!=null){
            System.out.println("Roll No : " + head.rollno + " - Name : " + head.name);
            head=head.next;
        }
    }
    void length(Node head){
        int cnt=1;
        while(head.next!=null){
            cnt++;
            head=head.next;
        }
        System.out.println("The no.of nodes : "+cnt);
    }
    Node delete(int pos, Node head) {
        if (head == null)
            return head;

        if (pos == 1)
            return head.next;

       Node temp = head;
        for (int i = 1; temp.next != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    } 
    Node reverse(Node head) {
        Node prev = null, curr = head, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    void sum(Node head){
        if(head==null)
        {
            System.out.println("No records ");
            return;
        }
        int sum=0;
        while(head!=null){
            sum=sum+head.rollno;
            head=head.next;
        }
        System.out.println("The sum is : "+sum);
    }
    void search(Node head,int rollno){
        if(head==null){
            System.out.println("No records ");
            return;
        }
        while(head!=null){
            if(head.rollno==rollno){
                System.out.println(rollno+" is available");
                return;
            }
            head=head.next;
        }
        System.out.println(rollno+" is not available");
    }
    void minmax(Node head){
        if(head==null){
            System.out.println("No records");
            return;
        }
        int min=head.rollno,max=head.rollno;
        while(head!=null){
            if(head.rollno<min){
                min=head.rollno;
            }
            if(head.rollno>max){
                max=head.rollno;
            }
            head=head.next;
        }
        System.out.println("Minimum Rollno : "+min);
        System.out.println("Maximum Rollno : "+max);
    }
    void sort(Node head){
        if(head==null){
            System.out.println("No records");
            return;
        }
        for(Node i=head;i.next!=null;i=i.next){
            Node min=i;
            for(Node j=i.next;j!=null;j=j.next){
                if(j.rollno<min.rollno){
                    min=j;
                }
                int temprollno=i.rollno;
                i.rollno=min.rollno;
                min.rollno=temprollno;
                String tempname=i.name;
                i.name=min.name;
                min.name=tempname;
            }
        }

    }
    public static void main(String args[]){
        LinkedList1 lst=new LinkedList1();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\t\t\t------ Menu ------");
            System.out.println("1. Insert in beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert in the position");
            System.out.println("4. Display");
            System.out.println("5. Delete");
            System.out.println("6. Length");
            System.out.println("7. Reverse");
            System.out.println("8. Sum of elements");
            System.out.println("9. Search");
            System.out.println("10. Min and Max");
            System.out.println("11. Sort ");
            System.out.println("12. Exit");
            System.out.print("Choose Option :");
            String n=sc.next();
            switch(n){
                case "1":
                    System.out.print("Enter Rollno and Name : ");
                    lst.head=lst.insertBegin(sc.nextInt(),sc.next(),lst.head);
                    System.out.println("Record Inserted at the beginning");
                    break;
                case "2":
                    System.out.print("Enter Rollno and Name : ");
                    lst.head=lst.insertEnd(sc.nextInt(),sc.next(),lst.head);
                    System.out.println("Record Inserted at the end");
                    break;
                case "3":
                    System.out.print("Enter Position : ");
                    int pos=sc.nextInt();
                    System.out.print("Enter Rollno and Name : ");
                    lst.head=lst.insertPos(sc.nextInt(),sc.next(),lst.head,pos);
                    System.out.println("Record Inserted at the Position");
                    break;
                case "4":
                    lst.display(lst.head);
                    break;
                case "5":
                    System.out.print("Enter Position to delete : ");
                    lst.head=lst.delete(sc.nextInt(),lst.head);
                    System.out.println("Record Deleted");
                    break;
                case "6":
                    lst.length(lst.head);
                    break;
                case "8":
                    lst.sum(lst.head);
                    break;
                case "9":
                    System.out.print("Enter Rollno to search : ");
                    lst.search(lst.head,sc.nextInt());
                    break;
                case "10":
                    lst.minmax(lst.head);
                    break;
                case "11":
                    lst.sort(lst.head);
                    break;
                case "7":
                    lst.head=lst.reverse(lst.head);
                    break;
            }
            System.out.print("Do you want to continue (Y/N) ?");
        }
        while(sc.next().equalsIgnoreCase("Y"));
    }

}