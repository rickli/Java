public class Clerk extends Employee{
	protected String office="wan da plaza";
	
	//办公室人员工资计算
	protected float calcMoney(){
		return super.salary*2;
	}

	public Clerk() {
		// TODO Auto-generated constructor stub
	}
	
	protected void showName(){
		
	}

}
