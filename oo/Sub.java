
public class Sub extends AbstractSuper{
	//抽象方法必须覆盖
	protected void methodB(){
		System.out.println("achieve methodB");
	}
	
	public Sub() {
		super.methodA();
		methodB();
	}

}
