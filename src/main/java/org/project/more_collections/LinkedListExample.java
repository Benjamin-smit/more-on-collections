package org.project.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // faster at manipulating the list
        // linked to each other for reference, like a chain
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");

        // faster at retrieving values (makes new array when adding/ removing from index)
        // uses array as underlying data structure
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1, "Jerry");





    }
}
