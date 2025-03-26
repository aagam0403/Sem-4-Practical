// 5. Write a java program to create two threads. One using runnable interface and other by extending thread. First thread will print all odd numbers and second will print all even numbers between 1 to 10.
class OddThread implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        }
    }
}

public class Q5OddEven {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        Thread ot = new Thread(new OddThread());

        ot.start();
        et.start();
    }
}
