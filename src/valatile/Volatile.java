package valatile;

import java.util.Scanner;

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
        Volatile aVolatile = new Volatile();
        new Thread(aVolatile,"thread A").start();
        System.out.println("main 线程正在运行") ;

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String value = sc.next();
            if(value.equals("1")){
                new Thread(() -> aVolatile.stopThread()).start();
                break ;
            }
        }
        System.out.println("主线程退出了！");

    }

    private void stopThread(){
        flag = false ;
    }
}
