// 6. Write a program to create three threads. Assign priority to thread. Make a class to test them. Also use Sleep method to give pause between them.

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(name + " is being executed");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted unexpectedly");
        }
    }
}

public class Q6TripleThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t3.start();
        t2.start();
        t1.start();
    }
}