package myservice;

/**
 * Created by h3ilang on 2017/5/5.
 */
public class Sub extends Main{
    synchronized public void b(){
        while (i >0) {
            try {
            i--;
            System.out.println("sub:"+i);
               // Thread.sleep(10l);
                a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
