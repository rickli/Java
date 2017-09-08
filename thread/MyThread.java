
public class MyThread implements Runnable {
    public MyThread() {
    }
    
    public void run() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doSth1();
        doSth2();
        doSth3();
        synchronized(this) {
            doSth4();
            doSth5();
        }
    }
    
    public void doSth1() {
        System.out.println(Thread.currentThread().getName() + "call doSth1");
    }
    
    public void doSth2() {
        System.out.println(Thread.currentThread().getName() + "call doSth2");
    }
    
    public void doSth3() {
        System.out.println(Thread.currentThread().getName() + "call doSth3");
    }
    
    public void doSth4() {
        System.out.println(Thread.currentThread().getName() + "call doSth4");
    }
    
    public void doSth5() {
        System.out.println(Thread.currentThread().getName() + "call doSth5");
    }
}