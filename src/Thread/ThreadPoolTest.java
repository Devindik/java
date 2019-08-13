package Thread;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author da xiong
 * @date 2019/8/13 11:30
 * @Description:
 */
public class ThreadPoolTest {
    private static final AtomicInteger FINISH_COUNT = new AtomicInteger(0);

    private static final AtomicLong COST = new AtomicLong(0);

    private static final Integer INCREASE_COUNT = 1000000;

    private static final Integer TASK_COUNT = 1000;

    @Test
    public void testRunWithoutThreadPool() {
        List<Thread> tList = new ArrayList<Thread>(TASK_COUNT);

        for (int i = 0; i < TASK_COUNT; i++) {
            tList.add(new Thread(new IncreaseThread()));
        }

        for (Thread t : tList) {
            t.start();
        }

        for (;;);
    }

    @Test
    public void testRunWithThreadPool() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100, 0, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());

        for (int i = 0; i < TASK_COUNT; i++) {
            executor.submit(new IncreaseThread());
        }

        for (;;);
    }

    private class IncreaseThread implements Runnable {

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();

            AtomicInteger counter = new AtomicInteger(0);
            for (int i = 0; i < INCREASE_COUNT; i++) {
                counter.incrementAndGet();
            }
            // 累加执行时间
            COST.addAndGet(System.currentTimeMillis() - startTime);
            if (FINISH_COUNT.incrementAndGet() == TASK_COUNT) {
                System.out.println("cost: " + COST.get() + "ms");
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(3,11,2);
        LinkedList<Integer> linkedList = Lists.newLinkedList();
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(1);
        Collections.sort(list);
        Collections.sort(linkedList);
        System.out.println(list.toString()+"__"+linkedList.toString());

    }
}
