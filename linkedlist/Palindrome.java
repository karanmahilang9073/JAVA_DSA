//check if linkedlist is a palindrome or not
//palindrome is a sequence of number in which the sequence starting with numbers would be must ending with that same sequence
//using arraylist--- time complexity--O(n) 
//steps -- 1.find mid, 2.reverse 2nd half, 3.check 1st half == 2nd half, 4.

//for even ll--->in slow-fast approach when fast=null, then slow=mid (slow-one step jump, fast-two step jump)
//for odd ll---> when fast.next=null, then slow=mid


public class Palindrome {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //creating head and tail
    public static Node head;
    public static Node tail;
    //size of linkedlist method
    public static int size;

    //add first
    public void addFirst(int data){
        Node newnode = new Node(data);//1. create new node
        size++;
        if ( head ==  null) {
            head = tail = newnode;
            return;
        }
        newnode.next= head;//2. newnode next = head
        head = newnode;//3. head will become new node
        
    }

    //add last
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    //print method
    public void show(){ //O(n) --> time complexity
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //check palindrome (slow-fast approach)
    //find mid
    public Node findMid(Node Node){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next; //+2
        }
        return slow;//slow is mid
    }

    public boolean checkpalindrome(){
        if (head==null || head.next==null) {
            return true;
        }
        //1--find mid
        Node midNode = findMid(head);

        //2--reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;

        //3--check left and right half
        while (right!=null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome pp = new Palindrome();
        pp.addFirst(1);
        pp.addFirst(2);
        pp.addFirst(2);
        pp.addFirst(1);

        pp.show();//1->2->2->1->null

        System.out.println(pp.checkpalindrome());//true

    }

}
