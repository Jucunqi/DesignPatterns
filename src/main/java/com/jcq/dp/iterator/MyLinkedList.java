package com.jcq.dp.iterator;


public class MyLinkedList<E> implements MyCollection<E>{


    private int size;
    private Node head;
    private Node tail;

    @Override
    public void add(E t) {

        Node node = new Node();
        node.setO(t);
        node.setNext(null);

        if (size == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return (E) node.getO();
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedIterator();
    }

    private class MyLinkedIterator implements MyIterator{


        private Node next = head;
        @Override
        public boolean hasNext() {

            if (next != null) {
                return true;
            }

            return false;
        }
        @Override
        public Object next() {
            Object o = next.getO();
            next = next.getNext();
            return o;
        }
    }
}


class Node{

    private Object o;

    private Node next;


    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
