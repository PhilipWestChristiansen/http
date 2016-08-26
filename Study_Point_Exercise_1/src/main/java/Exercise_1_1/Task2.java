package Exercise_1_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
