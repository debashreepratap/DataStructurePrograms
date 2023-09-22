package com.java8practice;

public class LinkedList<E> {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.nextNode != null){
                current =current.nextNode;
            }
            current.nextNode = newNode;
        }
    }
    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.nextNode;
        }
    }
     public void reverseList(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current != null ){
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;

        }
        head = prev;
     }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        System.out.println("Actual Linked list: ");
        list.printList();
        list.reverseList();
        System.out.println("Reveresed Linked list: ");
        list.printList();
    }
}


class Node{
     int data;
     Node nextNode;

    Node(int data){
        this.data = data;
        this.nextNode = null;
    }

}
