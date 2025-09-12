public class Linkedlist {
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


    //medthods to be perform operation in linkedlist

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

    // public void addmid(int index, int data){
    //     if (index == 0) {
    //         addFirst(data);
    //         return;
    //     }
    //     Node newnode = new Node(data);
    //     size++;
    //     Node temp =  head;
    //     int i = 0;
    //     while (i < index-1) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     newnode.next = temp.next;
    //     temp.next = newnode;
    // }

    public int removeFirst(){
        if (size==0) {
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val = head.data;
            head=tail=null;
            return  val;
        }
        //prev : size-2
        Node prev = head;
        for(int i = 0; i<size-2;i++){
            prev=prev.next;
        }

        int val = prev.next.data;//tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key){ //iterative search ----time complexity---O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { //item found case
                return i;
            }
            temp = temp.next;
            i++;
        }
        //if key not found
        return -1;
    }

    public int helper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearch(int key){ //recursive search
        return helper(head, key);
    }

    //reverse a linkedlist(iterative approach) ---time complexity is --> O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //findd and remove Nth node from End--time complexity is ----> O(n)
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; //is is like remove first operation
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(3);
        ll.addlast(4); //1->2->3->4->null
        ll.show();

        // ll.addmid(2,8);

        // ll.removeFirst();
        // ll.show();//2->3->4->null

        // ll.removeLast();
        // ll.show();//2->3->null

        // System.out.println(ll.itrsearch(3)); //1 because after all above all the operation 3 is at 1st index
        // System.out.println(ll.recursiveSearch(3));//1


        // ll.reverse();
        // ll.show(); //4->3->2->1->null

        ll.recursiveSearch(2);
        ll.show();

        ll.deleteNthfromEnd(2);
        ll.show();



    }
}


//check removeNthfrom end 