import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue q = new Queue<>();

    @Test
    void enqueue() {
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }

        assertTrue(q.size() == 10);
    }

    @Test
    void dequeue() {
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }

        for (int i = 0; i < 10; i++){
            assertTrue(Integer.parseInt(q.dequeue().toString()) == i);
        }
    }

    @Test
    void size() {
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }

        assertTrue(q.size() == 10);
    }

    @Test
    void sizeNull() {
        assertTrue(q.size() == 0);
    }


}