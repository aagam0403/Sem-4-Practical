// 7. Write a java program to create 3 threads using Thread class. Three threads should
// calculate the sum of 1 to 5, 6 to 10 and 11 to 15 respectively. After all thread finishes
// main thread should print the sum and average.
class SumThread extends Thread {
    int start, end;
    int sum = 0;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

public class Q7SumThread {
    public static void main(String[] args) {
        SumThread st1 = new SumThread(1, 5);
        SumThread st2 = new SumThread(6, 10);
        SumThread st3 = new SumThread(11, 15);

        st1.start();
        st2.start();
        st3.start();

        try {
            st1.join();
            st2.join();
            st3.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted the thread");
        }

        int sum = st1.getSum() + st2.getSum() + st3.getSum();
        int average = sum / 3;

        System.out.println("The sum of all threads is: " + sum);
        System.out.println("The average of all threads is: " + average);
    }
}
