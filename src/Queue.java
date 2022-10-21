import java.util.LinkedList;

public class Queue<T> {
    LinkedList<T> list;
    int size = 0;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
        size++;
    }

    public T dequeue() {
        if (size() != 0) {
            size--;
            return list.removeFirst();
        }

        return null;
    }

    public int size() {
        if (size != 0) {
            return size;
        }

        return 0;
    }
}
