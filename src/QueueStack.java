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
        s1.push(item);

        size++;
    }

    public T dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            return s2.pop();
        }

        return null;
    }

    public int size() {
        return size;
    }
}
