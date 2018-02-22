package chapter08;

/**
 * 
 * @author tengfei.fangtf
 * @version $Id: JoinCountDownLatchTest.java, v 0.1 2015-8-1 上午12:08:30 tengfei.fangtf Exp $
 */
public class JoinCountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        Thread parser1 = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });

        Thread parser2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("parser2 finish");
            }
        });

        parser1.start();
        parser2.start();
        parser1.join();
        parser2.join();
        System.out.println("all parser finish");
    }

}
