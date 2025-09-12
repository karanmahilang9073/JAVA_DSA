package doubly;

public class Doubly {
    //node class
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //addfirst
     public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
     }

     //print
    public void print(){
         Node temp = head;
         while (temp != null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
         }
         System.out.println("null");
    }


    //removefirst
    public int removefirst(){
        if (head == null) {
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Doubly ll = new Doubly();

        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();//1<->2<->3<->null

        ll.removefirst();
        ll.print();//2<->3<->null
    }
}
