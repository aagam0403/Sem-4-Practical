// 1. Write a program that executes two threads. One thread displays Thread1” every 2,000 milliseconds, and the other displays “Thread2” every 4,000 milliseconds. Create the threads by extending the Thread class
class Thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Process of Thread 1");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Process of Thread 2");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted");
        }
    }
}

public class Q1Threads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
