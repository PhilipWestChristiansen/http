package Exercise_2;

public class evenClass {

    private static int n = 0;

    public synchronized static int next() {
        n++;
        n++;
        return n;
    }

}
