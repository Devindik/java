package java.util.concurrent;

/**
 * @author da xiong
 * @date 2019/12/13 10:53
 * @Description:
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread() {
            @Override
            public void run() {

            }
        }.start();

    }
}
