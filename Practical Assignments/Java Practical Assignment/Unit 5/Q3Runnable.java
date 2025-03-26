// 3. Write a program to create a thread that implement runnable interface
class MyRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Runnable Thread Running");
                Thread.sleep(3000); // Sleep for 3000 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Q3Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        thread.start();
    }
}
