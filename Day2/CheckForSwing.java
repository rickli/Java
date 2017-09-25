public class CheckForSwing {
    public static void main(String[] args) {
    	boolean isMacOS = System.getProperty("mrj.version") != null;
    	System.out.println(isMacOS);
        try {
            Class.forName("javax.swing.JButton");
        } catch (ClassNotFoundException e) {
            String failure = "Sorry , but this version of MyApp needs \n" +
                "a Java Runtime with JFC/Swing components \n" +
                "having the final names(javax.swing.*)";
            System.out.println(failure);
        }
    }
}
