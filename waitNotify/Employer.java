
/**
  雇主类
 */
public class Employer implements Runnable{
	/**
	 私有的Utility属性
	 */
	private Utility utility;
	
	/**
	  私有的employer线程
	 */
	private Thread employerThread;
	
	/**
	  实现run接口
	 */
	public synchronized void run(){
		while(utility.getEmployerCircle()){
			utility.messagerEmployer();
		}
	}
	
	/**
	  构造函数
	  接收Utility参数
	 */
	public Employer(Utility utility){
		this.utility=utility;
	}
	
	/**
	  初始化线程并运行
	 */
	public void RunThread(){
		employerThread=new Thread(this,"employer");
		utility.setEmployerThread(employerThread);
		utility.getEmployerThread().start();
	}
}