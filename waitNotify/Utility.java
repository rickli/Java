
/**
  线程的公共类，真正实现线程间的交互
 */
public class Utility{
	/**
	  线程wait或notify的标志位
	 */
	private boolean flag=true;
	
	/**
	  employer线程终止的标志位
	 */
	private boolean employerCircle;
	
	/**
	  messager线程终止的标志位
	 */
	private boolean messagerCircle;
	
	/**
	  私有的messager线程
	 */
	private Thread messagerThread;
	
	/**
	  私有的employer线程
	 */
	private Thread employerThread;
	
	/**
	  messager线程的生命周期
	 */
	private int lifeMessager=1;
	
	/**
	  employer线程的生命周期
	 */
	private int lifeEmployer=1;
	
	/**
	  设置wait或notify的标志位
	 */	
	public void setFlag(boolean flag){
		this.flag=flag;
	}
	
	/**
	  得到wait或notify的标志位
	 */
	public boolean getFlag(){
		return flag;
	}
	
	/**
	  从Messager类得到messager线程来设置this.messager线程
	 */
	public void setMessagerThread(Thread messagerThread){
		this.messagerThread=messagerThread;
	}
	
	/**
	  返回messager线程
	 */
	public Thread getMessagerThread(){
		return messagerThread;
	}
	
	/**
	  从Employer类得到employer线程来设置this.employer线程
	 */
	public void setEmployerThread(Thread employerThread){
		this.employerThread=employerThread;
	}
	
	/**
	  返回employer线程
	 */
	public Thread getEmployerThread(){
		return employerThread;
	}
	
	/**
	  设置employer线程终止的标志位
	 */
	public void setEmployerCircle(boolean employerCircle){
		this.employerCircle=employerCircle;
	}
	
	/**
	  返回employer线程终止的标志位
	 */
	public boolean getEmployerCircle(){
		return employerCircle;
	}
	
	/**
	  设置messager线程终止的标志位
	 */
	public void setMessagerCircle(boolean messagerCircle){
		this.messagerCircle=messagerCircle;
	}
	
	/**
	  返回messager线程终止的标志位
	 */
	public boolean getMessagerCircle(){
		return messagerCircle;
	}
	
	/**
	  Messager的线程实施
	 */
	//当flag=true时Messager wait,当flag=false时Employer wait
	public synchronized void messagerMessager(){
		if(flag){
			//System.out.println ("Now messager is waiting for call!");
			//System.out.println ("messager status=wait");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		flag=true;
		switch(lifeMessager){
			case 1:
				System.out.println ("Messager:Yeah,I getta it");
				break;
			case 2:
				System.out.println ("Messager:Sure!");
				break;
			case 3:
				System.out.println ("Messager:OK!");
				break;
			default:
				this.setMessagerCircle(false);
		}
		lifeMessager++;
		//System.out.println ("messager status=notify");
		notify();
	}
	
	/**
	  Employer线程的实施
	 */
	public synchronized void messagerEmployer(){
		if(!flag){
			//System.out.println ("Now employer is waiting for call!");
			//System.out.println ("employer status=wait");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		switch(lifeEmployer){
			case 1:
				System.out.println ("Employer:Come to 131 mark Nan Jing Load and receive sth!");		
				break;
			case 2:
				System.out.println ("Employer:Oh,you come,please wait a minute,I'll get goods to you!");
				break;
			case 3:
				System.out.println ("Employer:Please send these shoes to 1501 room 5 mark 500 lane Bei Jing Road");
				break;
			default:
				this.setEmployerCircle(false);
		}
		lifeEmployer++;
		flag=false;
		//System.out.println ("Employer is notitied!");
		notify();
	}
}