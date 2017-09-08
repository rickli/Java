
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射测试
public class ReflectTest {

	public ReflectTest() {
		//callNoArgsConstructor("step1.reflect.DemoBean");//调用无参构造函数
		
		//调用有参构造函数****************************************************************************
		try {
			Constructor c = getReflectBean("DemoBean")
					.getConstructor(String.class,int.class);
			Object[] args=new Object[]{"aaa",13};
			callArgsConstructor(c,args);
		}catch(NoSuchMethodException e){e.printStackTrace();
		}catch(SecurityException e){e.printStackTrace();}
		//*******************************************************************************************
		callNoReturnNoArgsMethod("DemoBean","setInt");//调用无返无参
		
		callNoReturnArgsMethod("DemoBean","setInt");//调用有参无返回方法
		
		System.out.println(callReturnNoArgsMethod("DemoBean","getInt1"));//调用有返回无参
		
		System.out.println(callReturnArgsMethod("DemoBean","getInt2"));//调用有返回有参
		
		System.out.println(callStaticReturnArgsMethod("DemoBean","getA"));//调用静态有返回有参
	}
	
	/**
	 * 返回反射类
	 * @param className
	 * @return
	 */
public static Class getReflectBean(String className){
	Class bean=null;
	try{bean = Class.forName(className);  
	}catch(ClassNotFoundException e){e.printStackTrace();
	}catch(IllegalArgumentException e){e.printStackTrace();
	}catch(SecurityException e){e.printStackTrace();}
	return bean;
}
	
	/**
	 * 调用无参构造函数
	 * @param className 类名
	 */
public static void callNoArgsConstructor(String className){
	try{
		Constructor c = getReflectBean(className).getConstructor();
		Object o = c.newInstance();
	}catch(InstantiationException e){e.printStackTrace();
	}catch(IllegalAccessException e){e.printStackTrace();
	}catch(IllegalArgumentException e){e.printStackTrace();
	}catch(InvocationTargetException e){e.printStackTrace();
	}catch(NoSuchMethodException e){e.printStackTrace();
	}catch(SecurityException e){e.printStackTrace();} 
}
	
	/**
	 * 调用有参构造函数
	 * eg:调用用例
	 * try{
	 *		Constructor c = getBean("step1.reflect.DemoBean").getConstructor(String.class,int.class);
	 *		Object[] args=new Object[]{"aaa",13};
	 *		callArgsConstructor(c,args);
	 *	}catch(NoSuchMethodException e){e.printStackTrace();
	 *	}catch(SecurityException e){e.printStackTrace();}
	 * @param c 构造器
	 * @param args 参数数组
	 */
public static void callArgsConstructor(Constructor c,Object[] args){
	try{Object o = c.newInstance(args);
	}catch(InstantiationException e){e.printStackTrace();
	}catch(IllegalAccessException e){e.printStackTrace();
	}catch(IllegalArgumentException e){e.printStackTrace();
	}catch(InvocationTargetException e){e.printStackTrace();
	}catch(SecurityException e){e.printStackTrace();} 
}
	
	/**
	 * 调用无返回无参方法
	 * @param className 类名
	 * @param methodName 无返回无参方法名
	 */
	public static void callNoReturnNoArgsMethod(String className,String methodName){
		try {
			Class bean=getReflectBean(className);
			Constructor c = bean.getConstructor();
			Object o = c.newInstance();
			Method m = bean.getMethod(methodName, new Class[]{});
			m.invoke(o, null);
		}catch (InstantiationException e){e.printStackTrace();
		} catch (IllegalAccessException e){e.printStackTrace();
		} catch (IllegalArgumentException e){e.printStackTrace();
		} catch (InvocationTargetException e){e.printStackTrace();
		} catch (NoSuchMethodException e){e.printStackTrace();
		} catch (SecurityException e){e.printStackTrace();} 
	}
	
	/**
	 * 调用无返回有参方法
	 * @param className 类名
	 * @param methodName 无返回有参方法名
	 */
	public static void callNoReturnArgsMethod(String className,String methodName){
		try {
			Class bean=getReflectBean(className);
			Constructor c = bean.getConstructor();
			Object o = c.newInstance();
			Method m = bean.getMethod(methodName, new Class[]{int.class,String.class});//根据参数调整
			m.invoke(o, 11,"ccc");//根据参数调整
		}catch(InstantiationException e){e.printStackTrace();
		}catch(IllegalAccessException e){e.printStackTrace();
		}catch(IllegalArgumentException e){e.printStackTrace();
		}catch(InvocationTargetException e){e.printStackTrace();
		}catch(NoSuchMethodException e){e.printStackTrace();
		}catch(SecurityException e){e.printStackTrace();}
	}
	
	/**
	 * 调用有返回无参方法
	 * @param className 类名
	 * @param methodName 有返回无参方法
	 * @return
	 */
	public static Integer callReturnNoArgsMethod(String className,String methodName){
		Integer result=null;
		try {
			Class bean=getReflectBean(className);
			Constructor c = bean.getConstructor();
			Object o = c.newInstance();
			Method m = bean.getMethod(methodName, new Class[]{});  
			result=(Integer)m.invoke(o, null);
		} catch (InstantiationException e){e.printStackTrace();
		} catch (IllegalAccessException e){e.printStackTrace();
		} catch (IllegalArgumentException e){e.printStackTrace();
		} catch (InvocationTargetException e){e.printStackTrace();
		} catch (NoSuchMethodException e){e.printStackTrace();
		} catch (SecurityException e){e.printStackTrace();}
		return result;
	}
	
	/**
	 * 调用有返回有参方法
	 * @param className 类名
	 * @param methodName 有返回有参方法
	 * @return
	 */
	public static Integer callReturnArgsMethod(String className,String methodName){
		Integer result=null;
		try {
			Class bean=getReflectBean(className);
			Constructor c = bean.getConstructor();
			Object o = c.newInstance();
			Method m = bean.getMethod(methodName, new Class[]{String.class});//根据参数调整
			result=(Integer)m.invoke(o, "123");//根据参数调整
		}catch (InstantiationException e){e.printStackTrace();
		} catch (IllegalAccessException e){e.printStackTrace();
		} catch (IllegalArgumentException e){e.printStackTrace();
		} catch (InvocationTargetException e){e.printStackTrace();
		} catch (NoSuchMethodException e){e.printStackTrace();
		} catch (SecurityException e){e.printStackTrace();}
		return result;
	}
	
	/**
	 * 调用静态有返回有参方法
	 * @param className 类名
	 * @param methodName 有返回有参方法
	 * @return
	 */
	public static Float callStaticReturnArgsMethod(String className,String methodName){
		Float result=null;
		Class bean=getReflectBean(className);
		Method m;
		try {
			m = bean.getMethod(methodName, new Class[]{float.class});//根据参数调整
			result=(Float)m.invoke(bean, 123);//根据参数调整
		} catch (NoSuchMethodException e) {e.printStackTrace();
		} catch (SecurityException e) {e.printStackTrace();
		} catch (IllegalAccessException e) {e.printStackTrace();
		} catch (IllegalArgumentException e) {e.printStackTrace();
		} catch (InvocationTargetException e) {e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		new ReflectTest();
	}
}