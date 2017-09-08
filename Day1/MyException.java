
public class MyException extends Exception{

	public MyException(int code) {
		switch(code){
		case 1:
			System.out.println("occur no.1 error");
			break;
		case 2:
			System.out.println("occur no.2 error");
			break;
		}
	}
}
