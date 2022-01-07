package com.kunalsagar.lessions.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    public void shouldInitializeList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Assertions.assertNotNull(myLinkedList);
    }
}