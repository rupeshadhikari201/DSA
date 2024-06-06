package Java.LinkedList;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SingleLinkedList {

    public static void main(String[] args) {

        Node root = new Node(20);
        root = insertAtBegining(root, 30);
        root = insertAtBegining(root, 40);
        root = insertAtPosition(root, 2, 4);
        root = insertAtEnd(root, 100);
        // System.out.print("Before Deletion at position 0 : ");
        System.out.print("Before Deletion at position First and Last  : ");
        printLL(root);
        // root = deleteAtPosition(root, 0);
        root = deleteFirst(root);
        root = deleteLast(root);
        System.out.print("\nAfter Deletion at position First and Last   : ");
        printLL(root);
        System.out.print("\nReverse Print   : ");
        root = reversePrint(root);
        printLL(root);
    }

    // print the ll
    public static void printLL(Node node) {

        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // insert at begining
    public static Node insertAtBegining(Node node, int data) {

        // 1. create a node to insert
        Node new_node = new Node(data);

        // 2. make the new node as head
        new_node.next = node;

        // 3. make head to point the new_node
        node = new_node;

        return node;
    }

    // insert at index N
    public static Node insertAtPosition(Node node, int position, int data) {

        // 1. create a node to insert
        Node new_node = new Node(data);

        // 2. if poistion is zero
        if (position == 0) {
            new_node.next = node;
            return new_node;
        }

        // 2. traverse
        // 1->2->3
        // 1->2->4->3
        Node temp = node;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
            if (count == position - 1) {
                Node tail = temp.next;
                temp.next = new_node;
                new_node.next = tail;
                return node;
            }
        }
        // return node;
        throw new IllegalArgumentException("Position exceeds the length of the list.");
    }

    // insert At end
    public static Node insertAtEnd(Node node, int data) {

        // 1. create a node to insert
        Node new_node = new Node(data);

        // 2. traverse till the end (40->30->4-20)
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }

        // 3. update the temp.next to point new_node
        temp.next = new_node;

        return node;
    }

    public static Node deleteAtPosition(Node node, int position) {

        // if the position is 0
        if (position == 0) {
            return node.next;
        }

        // 1. itterate
        // let : 40 30 4 20 100 and pos = 2
        Node temp = node;
        int count = 0;
        while (temp.next != null) {

            if (count == position - 1) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                } else {
                    temp.next = null;
                }
            }
            count++;
            temp = temp.next;
        }

        return node;
    }

    public static Node deleteFirst(Node node) {
        return node.next;
    }

    public static Node deleteLast(Node node) {

        // 1. traverse
        Node temp = node;
        while (temp.next != null) {

            if (temp.next.next == null) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }

        return node;
    }

    public static Node reversePrintNode head) {

        Node prev = null;
        Node next = null;
        while (head != null) {

            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;

        return head;

    }
}
