package Collection;

import java.util.*;

public class MyLinkedList implements List {

    static class ListNode{

        public ListNode(ListNode prev, ListNode next, Object value){
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        ListNode prev;
        ListNode next;
        Object value;
    }

    private ListNode start = null;
    private ListNode tail = null;

    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        ListNode curr = start;
        while(curr != null){
            if(Objects.equals(curr.value,o))
                return true;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        ListNode newNode = new ListNode(tail,null,o);
        if(start == null)
            start = newNode;
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
        size ++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        start = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("out of bound:" + index + "in " + size);
        }
        ListNode curr = start;
        for(int i = 0; i < index; i ++)
        {
            curr = curr.next;
        }
        return curr.value;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
