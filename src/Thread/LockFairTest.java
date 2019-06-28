package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author da xiong
 * @date 2018/11/1 22:20
 * @Description:
 */
public class LockFairTest implements Runnable{

    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"获得锁");
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        LockFairTest lft = new LockFairTest();
        Thread th1 = new Thread(lft);
        Thread th2 = new Thread(lft);
        th1.start();
        th2.start();
    }
}
