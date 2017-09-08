public class Test {
	int a;
	Clerk clerk;

	public Test() {
		/*Clerk clerk=new Clerk();
		calc(clerk);
		
		Staff staff=new Staff();
		calc(staff);*/
		
		Clerk clerk=new Clerk();
		Staff staff=new Staff();
		calc(clerk);
		calc(staff);
	}
	
	//多态的方法
	private void calc(Employee employee){
		Clerk clerk=null;
		Staff staff=null;
		if(employee instanceof Clerk){
			clerk=(Clerk)employee;
			System.out.println(clerk.calcMoney());
		}else if(employee instanceof Staff){
			staff=(Staff)employee;
			System.out.println(staff.calcMoney());
		}
	}
	
	

	public static void main(String[] args) {
		new Test();

	}

}
