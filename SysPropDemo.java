public class SysPropDemo {
    
//    final static String UNIX_NULL_DEV = "/dev/null"; 
//    final static String WINDOWS_NULL_DEV = "NUL:"; 
//    final static String FAKE_NULL_DEV = "jnk";
//    
//    /** Return the name of the "Null Device" on platforms which support it,          
//     ** or "jnk" (to create an obviously well-named temp file) otherwise.          
//     */
//    public static String getDevNull() { 
//        if (new File(UNIX_NULL_DEV).exists()) { 
//            return UNIX_NULL_DEV; 
//        } 
//        
//        String sys = System.getProperty("os.name"); 
//           
//        if (sys==null) {
//            return FAKE_NULL_DEV;    
//        } 
//        
//        if (sys.startsWith("Windows")) { 
//            return WINDOWS_NULL_DEV; 
//        } 
//        return FAKE_NULL_DEV; 
//    }
    public static void main(String[] argv) {
//        System.out.println(SysPropDemo.getDevNull());
        boolean isMacOS = System.getProperty("mrj.version") != null;
        System.out.println(isMacOS);
        if(argv.length == 0) 
            System.getProperties().list(System.out);
        else {
            for (String s : argv) {
                System.out.println(s + " = " + System.getProperty(s));
            }
        }
    }
}