package com.captain_jack.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

//        myLinkedList.printList();

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst());

        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst());

        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
    }
}
