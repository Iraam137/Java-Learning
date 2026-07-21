// package Linked_List;

import java.util.List;


class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class LinkedList{

    Node head;

    void display(){
        System.out.println("print method running");
        System.out.println(head.next);
    }


    public void add(int data){
        Node newNode =new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
        temp.next=newNode;
    }
    public static void main (String[] args){
        LinkedList list =new LinkedList();

        list.add(10);
        // list.print();
        // list.add(20);
        // list.add(30);
        list.display();

        

       
    }
}

  