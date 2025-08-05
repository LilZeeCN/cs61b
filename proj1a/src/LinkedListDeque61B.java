import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T>{

    public LinkedListDeque61B() {
        sentinel = new Node();
        sentinel.item = null;
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

//    public LinkedListDeque61B(T x) {
//        sentinel = new Node();
//        sentinel.item = x;
//        sentinel.next = sentinel;
//        sentinel.prev = sentinel;
//    }

    public class Node {
        public T item;
        public Node next;
        public Node prev;
    }

    public Node sentinel;

    @Override
    public void addFirst(T x) {
        Node n = new Node();
        n.item = x;
        n.next=sentinel.next;
        n.next.prev=n;
        sentinel.next=n;
        n.prev=sentinel;
    }

    @Override
    public void addLast(T x) {
        Node n = new Node();
        n.item = x;
        n.prev = sentinel.prev;
        n.prev.next = n;
        sentinel.prev = n;
        n.next = sentinel;
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();
        Node cur = sentinel.next;
        while(cur!=sentinel)
        {
            list.add(cur.item);
            cur=cur.next;
        }
        return list;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
