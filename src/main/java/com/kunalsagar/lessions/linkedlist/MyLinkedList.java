package com.kunalsagar.lessions.linkedlist;


public class MyLinkedList {

    ListNode head;
    ListNode tail;
    int count;

    public MyLinkedList() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
        count = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= count)
            return -1;

        ListNode curr = head.next;
        int i = 0;
        while(i < index) {
            i++;
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        
    }

    public void addAtTail(int val) {


    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
