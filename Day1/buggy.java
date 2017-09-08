public class buggy {
    static String name;

    public static void main(String[] args) {
        name += "; The end.";
        System.out.println(name);
        
        int n = name.length();
        System.out.println(n);
    }
}
