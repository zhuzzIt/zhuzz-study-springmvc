package myservice;

/**
 * Created by h3ilang on 2017/5/5.
 */
public class Main {
    public int i =10;
    synchronized public void a(){
        try {
            i--;
            System.out.println("main:"+i);
            //Thread.sleep(10l);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
