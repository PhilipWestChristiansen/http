package Exercise_1_2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Threadclass extends Thread {

    String url;
    private byte bytearray[];

    public Threadclass(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            bytearray = bytecounter.getBytesFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(Threadclass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int calculatesum() {
        int sum = 0;
        for (int i = 0; i < bytearray.length; i++) {
            sum = sum + bytearray[i];
        }
        return sum;
    }
}
