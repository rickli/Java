
import java.util.ArrayList;
import java.util.List;

public class TestPolymorphic {

	public TestPolymorphic() {
		Employee ee=new Staff();
		System.out.println(ee.name);
		Clerk c=new Clerk();
		Staff s=new Staff();
		Employee[] e=new Employee[2];
		e[0]=c;
		e[1]=s;
		calcArray(e);
		
		/*List<Employee> list=new ArrayList<Employee>();
		list.add(c);
		list.add(s);
		calcList(list);*/
	}
	
	private void calcList(List<Employee> e){
		Employee tmpE=null;
		Clerk tmpC=null;
		Staff tmpS=null;
		for(int i=0;i<e.size();i++){
			tmpE=e.get(i);
			if(tmpE instanceof Clerk){
				tmpC=(Clerk)tmpE;
				System.out.println("clerk in" + tmpC.office);
				System.out.println("clerk salary=" + tmpC.calcMoney());
			}else if(tmpE instanceof Staff){
				tmpS=(Staff)tmpE;
				System.out.println("staff in" + tmpS.factory);
				System.out.println("staff salary=" + tmpS.calcMoney());
			}
		}
		tmpE=null;
		tmpC=null;
		tmpS=null;
	}
	
	//打包计算所有员工工资
	private void calcArray(Employee[] e){
		for(int i=0;i<e.length;i++){
			if(e[i] instanceof Clerk){
				Clerk c=(Clerk)e[i];
				System.out.println("clerk in" + c.office);
				System.out.println("clerk salary=" + c.calcMoney());
			}else if(e[i] instanceof Staff){
				Staff s=(Staff)e[i];
				System.out.println("staff in" + s.factory);
				System.out.println("staff salary=" + s.calcMoney());
			}
		}
	}

	public static void main(String[] args) {
		new TestPolymorphic();
	}
}