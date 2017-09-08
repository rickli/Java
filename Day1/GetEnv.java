public class GetEnv {
    public static void main(String[] argv) {
        try {
            Class.forName("javax.swing.JButton");
        } catch (ClassNotFoundException e) {
            String failure = "Sorry, but this version of MyApp needs \n" + 
                "a Java Runtime with JFC/Swing components\n" + "having the final names (javax.swing.*)"; // Better to make something appear in the GUI. Either a // JOptionPane, or: myPanel.add(new Label(failure)); 
            System.err.println(failure);
        } finally {
            String sysColor = System.getProperty("pencil_color");
            System.out.println(System.getProperty("java.specification.version"));
            System.out.println("System.getenv(\"PATH\") = " + System.getenv("PATH") +"  "+ sysColor);
        }        
    }
}