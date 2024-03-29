package Thread;

/**
 * @author da xiong
 * @date 2018/11/1 17:23
 * @Description:
 */
public class SynchronizedTest {
    public void method1() {
        synchronized (SynchronizedTest.class) {
            System.out.println("方法1获得ReentrantTest的锁运行了");
            method2();
        }
    }
    public void method2() {
        synchronized (SynchronizedTest.class) {
            System.out.println("方法1里面调用的方法2的重入锁,也正常运行了");
        }
    }

    public static void main(String[] args) {
        new SynchronizedTest().method1();
    }
}
