package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author da xiong
 * @date 2018/11/1 15:35
 * @Description:
 */
public class Ticket implements Runnable{
    private int num = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            lock.lock();
            if (num > 0) {
                // 输出卖票信息
                System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
            }
            lock.unlock();
        }
    }

//    @Override
//    public synchronized void run() {//方法同步锁
//        while (true) {
//            if (num > 0) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                }
//                // 输出卖票信息
//                System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
//            }
//        }
//    }

//    @Override
//    public void run() {//代码块同步锁
//        while (true) {
//            synchronized (this) {
//                if (num > 0) {
//                    System.out.println(Thread.currentThread().getName()+"....sale...."+num--);
//                }
//            }
//        }
//    }

//    @Override
//    public void run() {
//        while (true) {
//            if (num > 0) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                }
//                // 输出卖票信息
//                System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
//            }
//        }
//    }


    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        Thread t4 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
