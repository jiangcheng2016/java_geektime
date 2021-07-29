package Collection;

import java.util.*;

public class MyAarryList implements List {

    private Object[] elements;
    private int curr;

    public MyAarryList() {
        elements = new Object[16];
        curr = 0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ele:elements){
            if (Objects.equals(ele,o)){
                return true;
            }
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
        if(curr == elements.length - 1){
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);    //将原数组复制到新数组
            elements = temp;
        }
        elements[curr] = o;
        curr ++;
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
        curr = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > curr){
            throw new IndexOutOfBoundsException("out of bound" + curr + "for " + index);
        }
        return elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();

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
