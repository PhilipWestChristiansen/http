package Exercise_2_1;

public class Task1 extends Thread {
    
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(evenClass.next());
        }
    }
}
