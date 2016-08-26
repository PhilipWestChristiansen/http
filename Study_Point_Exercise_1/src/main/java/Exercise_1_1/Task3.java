package Exercise_1_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 extends Thread {
    
    long time = System.currentTimeMillis();
    int count = 9;
    
    public void run() {
        while (System.currentTimeMillis() <= time + 10000) {
            count++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(count);

        }
        
    }
}
