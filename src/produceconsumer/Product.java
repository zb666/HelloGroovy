package produceconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Product {

    private final static Object S_LOCK = new Object();
    //是否生产过了
    public static volatile boolean flag = false;

    public static volatile int number = 0;

    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

    public class Consume implements Runnable {

        @Override
        public void run() {
            synchronized (S_LOCK) {
                if (!flag) {
                    try {
                        //没有生产过 让出cpu轮训时间片
                        S_LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number--;
                flag = false;
                System.out.print("\n " + "消费者 number：" + number + "    Flag：" + flag);
                S_LOCK.notifyAll();
            }
        }
    }


    public class Produce implements Runnable {

        @Override
        public void run() {
            synchronized (S_LOCK) {
                //生产过了，让消费者消费之后方可以进行再次的生产
                if (flag) {
                    try {
                        //未进行消费 让出cpu 时间片
                        S_LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number++;
                flag = true;
                System.out.print("\n " + "生产者 number：" + number + "    Flag：" + flag);
                S_LOCK.notifyAll();
            }
        }
    }

    private Produce produce = new Produce();

    private Consume consume = new Consume();

    void testProduct() {
        newCachedThreadPool.execute(produce);
        newCachedThreadPool.execute(consume);
    }

}
