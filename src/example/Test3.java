package example;

public class Test3 {

    public static void main(String[] args) {
        while (true) {
            startThead();
        }
    }

    public static int threadCount = 100;   //线程数量
    private static boolean isRunGrabThread = true;     //抓取线程是否执行完毕
    static int  num = 1; //动态参数

    public static void startThead(){
        Thread[] grabThreads= new Thread[threadCount];
        try{
            //开启-数据抓取子线程
            for(int i=0;i<grabThreads.length;i++){
                int numL = num;
                System.out.println(numL);
                String url = "https://api.dev.globalwinner.cn/prod.html?&id=993";
                Thread searchThread=new TestThread(url);
                num++;
                grabThreads[i] = searchThread;
                grabThreads[i].setDaemon(true);
                grabThreads[i].start();
            }

            isRunGrabThread = true;

            //监控子线程,全部完成程序退出
            WhileLoop:

            while(true){

                //拨号策略控制
                //reconnectControl();

                //判断子线程是否运行完成
                for(int i=0;i<threadCount;i++){
                    if(grabThreads[i].isAlive()){
                        Thread.sleep(10);
                        continue WhileLoop;
                    }
                }

                //所有抓取线程执行完毕
                isRunGrabThread = false;

                //子线程执行完毕则退出
                break;
            }
        }
        catch (Exception e) {
            System.out.println("main主线程--系统异常!");
        }
    }

}