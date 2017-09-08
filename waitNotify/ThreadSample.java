
/**
  测试多线程
 */
public class ThreadSample{
	/**
	  私有的Messager对象
	 */
	private Messager messager;
	
	/**
	  私有的Employer对象
	 */
	private Employer employer;
	
	/**
	  私有的Utility对象
	 */
	private Utility utility;
	
	public static void main(String[] args){
		new ThreadSample();
	}
	
	/**
	  构造函数，运行messager和employer2个线程
	 */
	public ThreadSample(){
		Utility utility=new Utility();
		Employer employer=new Employer(utility);
		Messager messager=new Messager(utility);
		utility.setFlag(true);
		utility.setEmployerCircle(true);
		utility.setMessagerCircle(true);
		messager.RunThread();
		employer.RunThread();
	}
}