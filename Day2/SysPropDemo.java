
public class SysPropDemo {
    public static void main(String[] argv)  {
    	boolean isMacOS = System.getProperty("mrj.version") != null;
    	System.out.println(isMacOS);
        if (argv.length == 0) {

//            System.getProperties().list(System.out);
        } else {
            for(String s : argv) {
            	
//                System.out.println(s + " = " + System.getProperty(s));
                
            }
        }
    }
}
