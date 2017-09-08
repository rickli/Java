package Java.reflect;

public class DemoBean {
    //无参构造函数
    public DemoBean() {
        System.out.println("Call DemoBean() Constructor Function!");
    }

    // 有参构造函数
    public DemoBean(String a, int b) {
        System.out.println("Call DemoBean(String a, int b) Constructor Function!");
    }

    //静态方法
    public static float getA(float x) {
        System.out.println("a");
        return x;
    }

    //无参无返回方法
    public void setInt() {
        System.out.println("Call setInt()");
    }
    //有参无返回方法
    public void setInt(int num, String str) {
        System.out.println("Call setInt(int num, string str)");
    }
    // 无参有返回方法
    public Integer getInt1() {
        return 1;
    }
    // 有参有返回方法
    public Integer getInt2(String str) {
        return Integer.parseInt(str);
    }
}
