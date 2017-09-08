
package Java.thread;

public class TestThread {
    public TestThread() {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        Thread t3 = new Thread(mt3);
        t1.setName("threadm1");
        t2.setName("threadm2");
        t3.setName("threadm3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main(String[] args) {
        new TestThread();
    }

}
