
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {

	public LambdaTest() {
//		callThread();//线程调用
//		callList();//集合调用
		callPredicate();//函数式接口调用
//		callMap();//map->对象转换
//		callReduce();//reduce->将所有值合并成一个
	}
	
	//线程调用
	private void callThread(){
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
	}
	
	//集合调用
	private void callList(){
		List<String> f=new ArrayList<String>();
		f.add("Lambdas");
		f.add("Default Method");
		f.add("Stream API");
		f.add("Date and Time API");
		for(String s:f) System.out.println(s);
		
		// Java 8之后：
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
		 
		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
		// 看起来像C++的作用域解析运算符
		features.forEach(System.out::println);//:: 赋值
		
	}
	
	//函数式接口调用
	private void callPredicate(){
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
	    System.out.println("Languages which starts with J :");
	    filter2(languages, (str)->((String) str).startsWith("J"));
	    System.out.println("Languages which ends with a ");
	    filter2(languages, (str)->((String) str).endsWith("a"));
	    System.out.println("Print all languages :");
	    filter2(languages, (str)->true);
	    System.out.println("Print no language : ");
	    filter2(languages, (str)->false);
	    System.out.println("Print language whose length greater than 4:");
	    filter2(languages, (str)->((String) str).length() > 4);
		 // 甚至可以用and()、or()逻辑函数来合并Predicate，
		 // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
		 Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		 Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		 languages.stream().filter(startsWithJ.and(fourLetterLong))
		     .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
		 System.out.println();
		 
		 List<String> filtered = languages.stream().filter(x -> x.length()> 4).collect(Collectors.toList());
		 System.out.printf("Original List : %s, filtered list : %s %n", languages, filtered);//%n表示换行=/n
	}
	
	private void filter1(List<String> names, Predicate<String> condition) {
	    for(String name: names)  {
	        if(condition.test(name)) {
	            System.out.println(name + " ");
	        }
	    }
	}
	//定制的 filter()方法替换成写在里面的内联代码
	private void filter2(List<String> names, Predicate<String> condition) {
	    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
	        System.out.println(name + " ");
	    });
	}
	
	//map->对象转换
	private void callMap(){
		// 不使用lambda表达式为每个订单加上12%的税
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		for (Integer cost : costBeforeTax) {
		    double price = cost + .12*cost;
		    System.out.println(price);
		}
		// 使用lambda表达式
		costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
		
		//将字符串换成大写并用逗号链接起来
		List<String> g7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String g7Countries = g7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(g7Countries);
		
		//用所有不同的数字创建一个正方形列表并去除重复
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);

		//获取数字的个数、最小值、最大值、总和以及平均值
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
	}

	//reduce->将所有值合并成一个
	private void callReduce(){
		// 为每个订单加上12%的税
		// 老方法：
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double total = 0;
		for (Integer cost : costBeforeTax) {
		    double price = cost + .12*cost;
		    total = total + price;
		}
		System.out.println("Total : " + total);
		 
		double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);

	}

	public static void main(String[] args) {
		new LambdaTest();
	}
}