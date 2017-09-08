
/**
  快递员类
 */
public class Messager implements Runnable{
	/**
	  私有的Utility属性
	 */
	private Utility utility;
	
	/**
	  私有的messager线程
	 */
	private Thread messagerThread;
	
	/**
	  实现run接口
	 */
	public synchronized void run(){
		while(utility.getMessagerCircle()){
			utility.messagerMessager();
		}
	}
	
	/**
	  构造函数
	  接收Utility参数
	 */
	public Messager(Utility utility){
		this.utility=utility;
	}
	
	/**
	  初始化线程实例并运行
	 */
	public void RunThread(){
		messagerThread=new Thread(this,"messager");
		utility.setMessagerThread(messagerThread);
		utility.getMessagerThread().start();
	}
}