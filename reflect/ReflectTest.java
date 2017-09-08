package Java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public ReflectTest() {
        System.out.println(callStaticReturnArgsMethod("step1.reflect.DemoBean","getA"));//调用静态有返回有参
    }
    /**
     * 返回反射类
     * @param className
     * @return
     */
    public static Class getReflectBean(String className){
        Class bean = null;
        try{
            bean = Class.forName(className);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(SecurityException e){
            e.printStackTrace();
        }
        return bean;
    }
    /**
     * 调用无参构造函数
     * @param className
     */
    public static void callNoArgsConstructor(String className){
        try{
            Constructor c = getReflectBean(className).getConstructor();
            Object o = c.newInstance();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }catch(SecurityException e){
            e.printStackTrace();
        }
    }
}
