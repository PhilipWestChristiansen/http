package Exercise_2_1;

public class evenClass {

    private static int n = 0;

    public synchronized static int next() {
        n++;
        n++;
        return n;
    }

}
