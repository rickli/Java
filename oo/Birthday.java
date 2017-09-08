import java.util.Calendar;

public class Birthday {

	private int year,month,day;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//封装，同时建议年月日的组合有效性
	private boolean validateDate(int year,int month,int day){
		//1year,month,day不能为负数
		
		//2
		
		//3
		
		//4
		
		//
		return false;
	}

	public Birthday(int year,int month,int day) {
		System.out.println(judgeFegLastDayNum(year));
		//validateDate(year,month,day);
	}
	
	public int judgeFegLastDayNum(int year){
		Calendar cale=Calendar.getInstance();
		cale.set(year, 2, 1);
		cale.add(Calendar.DATE, -1);
		return cale.get(Calendar.DATE);
	}

	public static void main(String[] args) {
		new Birthday(2015,2,30);
	}
}