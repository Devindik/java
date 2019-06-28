package valatile;

/**
 * @author da xiong
 * @date 2019/3/8 18:30
 * @Description:
 * https://crossoverjie.top/%2F2018%2F03%2F09%2Fvolatile%2F
 */
public class Volatile implements Runnable{

    private static volatile boolean flag = true;

    @Override
    public void run() {
        while (flag){

        }
        System.out.println(Thread.currentThread().getName() +"执行完毕");
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile voletile = new Volatile();
        new Thread(voletile,"thread A").start();
        System.out.println("main ");

    }
}
