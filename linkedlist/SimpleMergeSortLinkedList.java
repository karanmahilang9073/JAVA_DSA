//find mid(in even ll, first halfs last node should be taken as mid)-->divide the ll in two parts(mid.next==null-->sort both half-->merge them


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SimpleMergeSortLinkedList {

    // MergeSort function
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; // already sorted
        }

        // Split list into two halves
        Node middle = getMiddle(head);
        Node nextHalf = middle.next;
        middle.next = null; // break into two lists

        // Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextHalf);

        // Merge both sorted halves
        return merge(left, right);
    }

    // Merge two sorted linked lists
    private Node merge(Node a, Node b) {
        Node dummy = new Node(0); // dummy head
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (a != null) tail.next = a;
        if (b != null) tail.next = b;

        return dummy.next;
    }

    // Find middle node (slow-fast pointer)
    private Node getMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Print linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleMergeSortLinkedList list = new SimpleMergeSortLinkedList();

        // Create unsorted linked list: 4 -> 2 -> 1 -> 3
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Unsorted List:");
        list.printList(head);

        head = list.mergeSort(head);

        System.out.println("Sorted List:");
        list.printList(head);
    }
}
