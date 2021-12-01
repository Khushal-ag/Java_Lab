// Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
package questions.week7;

public class twoThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: Scooby");
            }
        });
        thread1.setName("Scooby");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2: Shaggy");
            }
        });
        thread2.setName("Shaggy");
        thread2.start();
    }
}
