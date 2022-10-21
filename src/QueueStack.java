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

        while (s1.size() != 0) {
            s2.push(s1.pop());
        }

        size++;
    }

/*    public T dequeue() {
        if (size() != 0) {
            size--;
            return list.removeFirst();
        }

        return null;
    }*/

    public int size() {
        if (size != 0) {
            return size;
        }

        return 0;
    }

    public static void main(String[] args) {
        QueueStack<Integer> qqq = new QueueStack<>();

        for (int i = 0; i < 5; i++) {
            qqq.enqueue(i);
        }
    }
}
