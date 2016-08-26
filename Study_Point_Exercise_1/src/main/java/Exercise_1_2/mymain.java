package Exercise_1_2;

public class mymain {

    public static void main(String[] args) throws InterruptedException {
        Threadclass thread1 = new Threadclass("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        thread1.start();

        Threadclass thread2 = new Threadclass("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        thread2.start();

        Threadclass thread3 = new Threadclass("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("total = " + (thread1.calculatesum()));

    }
}
