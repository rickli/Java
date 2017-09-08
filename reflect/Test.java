package Java.reflect;

public class Test {
    public Test() {
        DemoBean db = new DemoBean();
        DemoBean db1 = new DemoBean("aaa", 111);
        db.getInt1();
        db.getInt2("123");
        DemoBean.getA(123);
    }

    public static void main(String[] args) {
        new Test();
    }
}
