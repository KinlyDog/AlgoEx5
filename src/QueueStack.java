import java.util.Stack;

public class QueueStack<T> {
    Stack<T> s1;
    Stack<T> s2;
    int size = 0;

    public QueueStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(T item) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(item);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        size++;
    }

    public T dequeue() {
        if (size() != 0) {
            size--;
            return s1.pop();
        }

        return null;
    }

    public int size() {
        return size;
    }
}
