package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {

    Node root = new Node(0, null);

    public static void main(String[] args) {

        // System.out.println(root.data);
        // System.out.println(root.next);
    }

}
