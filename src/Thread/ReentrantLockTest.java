package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author da xiong
 * @date 2018/11/1 15:00
 * @Description:
 */
public class ReentrantLockTest implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;
    @Override
    public void run() {
        for (int j=0; j< 10000;j++) {
            lock.lock();
            try {
                i++;
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReentrantLockTest test = new ReentrantLockTest();
        Thread thread1 = new Thread(test);
        Thread thread2 = new Thread(test);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
