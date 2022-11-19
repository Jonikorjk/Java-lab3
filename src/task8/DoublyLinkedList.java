package task8;

public class DoublyLinkedList<T> {
    private class Node {
        T data;
        Node next, prev;
        Node(Node prev, T data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        @Override
        public String toString() {
            return data.toString();
        }
    }
    private Node first = null;
    private Node last  = null;
    private int count = 0;
    public void add(T elem) {
        Node newNode = new Node(first, elem,null);
        if (first == null) {
            first = last = newNode;
            first.prev = null;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        last.next = null;
        count++;
    }

    public void remove(T value) {
        if (first != null && first.data.equals(value)) {
            first = first.next;
            first.prev = null;
            count--;
        }
        else {
            Node link = first;
            while (link.next != null) {
                if (link.next.data.equals(value)) {
                    link.next = link.next.next;
                    if (link.next != null)
                        link.next.prev = link;
                    count--;
                }
                if (link.next == null) {
                    last = link;
                    break;
                }
                link = link.next;
            }
        }
    }
    public final int size() {
        return this.count;
    }
    @Override
    public String toString() {
        String s = "size = " + size() + "\n[";
        Node link = first;
        while (link != null) {
            s += link.data;
            link = link.next;
            if (link != null)
                s += ", ";
        }
        s += "]";
        return s;
    }

    public Node next(Node node) {
        return  node.next;
    }
    public Node prev(Node node) {
        return  node.prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Initial list:\n" + list);
        list.add(5);
        System.out.println("\nAdd new element:\n" + list);
        list.remove(2);
        System.out.println("\nRemove second element:\n" + list);
    }
}

