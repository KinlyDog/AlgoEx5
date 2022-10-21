import java.util.Stack;

public class QueueStack<T> {
    Stack<T> s1;
    Stack<T> s2;

    public QueueStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(T item) {
        s1.push(item);
    }

    public T dequeue() {
        if (size() == 0) {
            return null;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int size() {
        return s1.size() + s2.size();
    }
}
