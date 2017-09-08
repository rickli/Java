public class Demo {
    public static void main(String args[]) {
//        long num = 100;
//        int x = num + 2;
//        System.out.println(x);
        int i = 1;
        int j = i++;
        System.out.println("i = "+i+", j = "+j);
        if((i==(++j))&&((i++)==j)) {
        	System.out.println("i = "+i+", j = "+j);
            i += j;
        }
        System.out.println("i = "+i);
        String str = "";
        for (int x = 0; x < 5; x++) {
            str += x;
        }
        System.out.println(str);
        int sum = 0;
        for(int x = 0; x < 10; x++) {
        	System.out.println(x);
            sum += x;
            if(x % 3 == 0) {
                break;
            }
        }
        System.out.println(sum);
        boolean flag = 10%2 == 1 && 10 /3 == 0 && 1/0 == 0;
        System.out.println(flag? "mldn" : "yootk");
        
        int x = 10;
        double y = 20.2;
        long z = 10L;
        String str1 = "" + x + y*z;
        System.out.println(str1);
        System.out.println(inc(10) + inc(8) + inc(-10));
    }
    
    public static int inc(int temp) {
        if(temp > 0) {
            return temp *2;
        }
        return -1;
    }
}
