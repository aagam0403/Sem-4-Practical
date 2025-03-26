// 2. Write a program that executes two threads. One thread will print the even numbers and the other thread will print odd numbers from 1 to 50.
class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        }
    }
}

class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        }
    }
}

public class Q2NumsThreads {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();

        ot.start();
        et.start();
    }
}
