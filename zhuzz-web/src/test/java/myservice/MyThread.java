package myservice;

/**
 * Created by h3ilang on 2017/5/5.
 */
public class MyThread  extends Thread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }

    @Override
    public void run() {
        Sub s = new Sub();
        s.b();
    }
}
