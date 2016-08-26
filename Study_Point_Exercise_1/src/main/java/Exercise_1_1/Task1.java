package Exercise_1_1;

public class Task1 extends Thread {
    
    long count;
    long sum;

    public void run() {
        while (count <= 1000000000) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}
