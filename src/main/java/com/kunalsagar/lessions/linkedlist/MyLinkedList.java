package com.kunalsagar.lessions.linkedlist;


public class MyLinkedList {

    ListNode head;

    public MyLinkedList() {

    }

    public int get(int index) {

        var i = 0;
        var current = head;
        while(current != null) {
            if(i == index)
                return current.getVal();

            current = current.getNext();
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);

        if(head == null) {
            head = node;
            return;
        }

        var current = head;
        while(current != null) {

            if(current.getNext() == null) {
                current.setNext(node);
                return;
            }
            current = current.getNext();
        }

    }

    public void addAtIndex(int index, int val) {
        var current = head;
        ListNode prev = null;
        var i = 0;
        while(current != null) {
            if(i + 1 == index) {
                ListNode node = new ListNode(val);
                if(prev != null) {
                    prev.setNext(node);
                    node.setNext(current);
                    return;
                }
            }
            prev = current;
            current = current.getNext();
            i++;
        }

        if(i + 1 == val) {
            ListNode node = new ListNode(val);
            current.setNext(node);
        }
    }

    public void deleteAtIndex(int index) {
        var i = 0;
        var current = head;
        ListNode prev = null;
        while(current != null) {
            if(i == index){
                if(prev != null)
                    prev.setNext(current.getNext());
            }
            prev = current;
            current = current.getNext();
            i++;
        }
    }
}

class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
