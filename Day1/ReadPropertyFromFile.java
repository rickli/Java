
import java.io.InputStream;
import java.util.Properties;

class ReadPropertyFromFile{
	public static void main(String[] args){
		new ReadPropertyFromFile();
	}
	
	ReadPropertyFromFile(){
		String Father=" ";
		String Mother=" ";
		String Son=" ";
		String Daughter=" ";
		try{
			InputStream is = getClass().getResourceAsStream("familys.property");
			Properties getFamily=new Properties();
			getFamily.load(is);
			Father=getFamily.getProperty("Father");
			Mother=getFamily.getProperty("Mother");
			Son=getFamily.getProperty("Son");
			Daughter=getFamily.getProperty("Daughter");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println (Father);
		System.out.println (Mother);
		System.out.println (Son);
		System.out.println (Daughter);		
	}
}