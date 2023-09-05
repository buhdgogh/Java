package com.collection_.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] arr = new Node[16];

        Node jack = new Node("jack", null);
        arr[2] = jack;
        Node tom = new Node("tom", null);
        jack.next = tom;

    }
}

class Node {
    public Object obj;
    public Node next;

    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }
}
