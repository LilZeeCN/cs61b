import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;
public class ArrayDeque61B<T> implements Deque61B<T>{
    private int f;
    private int l;
    T[] list = (T[]) new Object[8];
    public ArrayDeque61B() {

    }

    @Override
    public void addFirst(T x) {
        int pos = Math.floorMod(f-1,8);
        f--;
        list[pos] = x;
    }

    @Override
    public void addLast(T x) {
        int pos = Math.floorMod(l,8);
        l++;
        list[pos] = x;
    }

    @Override
    public List<T> toList() {
        List<T> ans = new ArrayList<>();
        Collections.addAll(ans, list);
        return ans;
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
