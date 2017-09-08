import java.util.Properties;
import java.util.Enumeration;
public class MyProperty{
	
	public static void main(String[] args){
		Properties p=System.getProperties();
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements()){
			String en=(String)e.nextElement();
			String ps=p.getProperty(en);
			System.out.println (en + " value="+ ps);
		}
	}
}