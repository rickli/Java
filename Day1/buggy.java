public class buggy {
    static String name;

    public static void main(String[] args) {
        int n = name.length();
        System.out.println(n);

        name += "; The end.";
        System.out.println(name);
    }
}
