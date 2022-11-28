package com.yearup.week4.code.stack;

import java.util.LinkedList;

public class MyLinkedList {

        static class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public void printList(Node head){
                while(head!=null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

        public void addEnd(Node head, Node node){
            while(head.next!=null){
                head = head.next;
            }
            head.next = node;
        }
    }

    public static void main(String[] args) {
//        Node b = new Node(2, null);
//        Node a = new Node(1, b);
////        System.out.println(a.next);
//        a.printList(a);
//        a.addEnd(a, new Node(3, null));
//        a.addEnd(a, new Node(4, null));
//        a.addEnd(a, new Node(5, null));
//        System.out.println();
//        a.printList(a);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        for(int i =0;i<ll.size();i++)
            System.out.print(ll.get(i)+ " ");

        // 1 -> 2
    }
}
