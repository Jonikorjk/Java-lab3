package task7;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class OwnContainer<E> extends AbstractList<E> {
    @SuppressWarnings("unchecked")
    ArrayList<Object> arr = new ArrayList<>();
    private int from;
    private int to;

    OwnContainer(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public E get(int index) {
        if (index >= from && index <= to) {
            return (E)arr.get(index - from);
        }
        return null;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public void add(int index, E element) {
        if (element != null && index >= from && index <= to) {
            arr.add(index - from, element);
        }
    }

    @Override
    public boolean add(E e) {
        if (e != null && arr.size() < (to - from + 1)) {
            return arr.add(e);
        }
        return false;
    }

    @Override
    public E set(int index, E element) {
        if (element != null && index >= from && index <= to) {
            return (E)arr.set(index - from, element);
        }
        return null;
    }

    @Override
    public E remove(int index) {
        if (index >= from && index <= to) {
            return (E)arr.remove(index - from);
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return arr.indexOf(o) + from;
    }

    @Override
    public int lastIndexOf(Object o) {
        return arr.lastIndexOf(o) + from;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>)arr.iterator();
    }

}
