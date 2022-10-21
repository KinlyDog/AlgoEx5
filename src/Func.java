public class Func {
    public static Queue<Integer> rotateQueue(Queue<Integer> qe, int n) {
        for (int i = 0; i < n; i++) {
            qe.enqueue(qe.dequeue());
        }

        return qe;
    }
}
