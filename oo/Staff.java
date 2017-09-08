
public class Staff extends Employee{
	protected String name="jack";

	protected String factory="jia ding";
	
	//普通工人工资计算
	protected float calcMoney(){
		return super.salary*1.5f;
	}
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	protected void showName(){
		
	}
}