// 4. Write a java program which create threads using the thread class.

// The EvenThread class prints the even numbers from 1 to 50.
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

// The OddThread class prints the odd numbers from 1 to 50.
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

public class Q4ThreadClass {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();

        ot.start();
        et.start();
    }
}