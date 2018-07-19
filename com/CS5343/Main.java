package com.CS5343;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        Node head = ll.rinsert(null, 7);
        ll.rinsert(head, 3);
        ll.rinsert(head, 9);
        ll.rinsert(head, 2);
        ll.rinsert(head, 5);
        ll.rinsert(head, 12);
        ll.rinsert(head, 22);
        ll.rinsert(head, 15);
        ll.rinsert(head, 17);
        ll.rinsert(head, 30);
        ll.rinsert(head, 24);
        ll.rinsert(head, 1);
        ll.rinsert(head, 18);
        ll.rinsert(head, 22);
        ll.rinsert(head, 0);
        System.out.println("Linked list numbers before sorting");
        ll.rprint(head);
        Node shead = ll.selectionsort(head);
        System.out.println("Linked list numbers after sorting");
        ll.rprint(shead);
    }
}
