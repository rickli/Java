
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Collection {

	public Collection() {
//		showSet();
//		showList();	
//		showVector();
//		showHashTable();	
		//showHashMap();
		showLinkedHashMap();
	}
	
	private void showSet(){
		//Set
		Set<Object> set=new HashSet<Object>();
		set.add("1");
		set.add("2");
		set.add("2");
		set.add(new Integer(1));
		set.add(new Integer(2));
		Iterator<Object> itt=set.iterator();
		while(itt.hasNext()){
			System.out.println (itt.next());
		}
	}
	
	private void showList(){
		//List
		List<Object> l=new ArrayList<Object>();
		l.add("a");
		l.add("b");
		l.add("b");
		Iterator<Object> it=l.iterator();
		while(it.hasNext()){
			System.out.println (it.next());
		}
		for(int i=0;i<l.size();i++){
			System.out.println (l.get(i));
		}
	}
	
	private void showVector(){
		Vector<Object> vector=new Vector<Object>();
		vector.add("ddd");
		vector.add("eee");
		vector.add("eee");
		Iterator<Object> iterator=vector.iterator();
		while(iterator.hasNext()){
			System.out.println (iterator.next());
		}
		Enumeration<Object> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println (en.nextElement());
		}
		System.out.println (en);
	}
	
	private void showHashTable(){
		Hashtable<String,String> ht=new Hashtable<String,String>();
		String x=null;
		ht.put("001","wang");
		//ht.put(null,null);//key和value都不能包含null
		ht.put("003","Li");
		
		//直接查找
		System.out.println(ht.containsKey("002"));
		
		//直接查找结果
		System.out.println(ht.get("001"));
		
		//随机排序遍历（优化）
		Set<Entry<String, String>> htSet=ht.entrySet();
		Iterator<Entry<String, String>> it=htSet.iterator();
		Entry<String, String> entry=null;
		while(it.hasNext()){
			entry=it.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		//随机排序遍历（不优化）
		Enumeration<String> e=ht.keys();
		String tmpKey="";
		while(e.hasMoreElements()){
			tmpKey=(String)e.nextElement();
			System.out.println(tmpKey+"---"+ht.get(tmpKey));
		}
	}
	
	private void showHashMap(){
		HashMap hm=new HashMap();
		hm.put("001","wang");
		hm.put("002","zhang");
		hm.put(null,null);
			
		System.out.println("hm 002 value=" + hm.get("002"));
		System.out.println("hm null value=" + hm.get(null));
	}
	
	private void showLinkedHashMap(){
		LinkedHashMap<String,String> ht=new LinkedHashMap<String,String>();
		String x=null;
		ht.put("001","wang");
		ht.put(null,"ffffff");//key和value都能包含null
		ht.put("003","sdfdsfdsfdsf");
		
		//直接查找
		System.out.println(ht.containsKey("002"));
		
		//随机排序遍历（优化）
		Set<Entry<String, String>> htSet=ht.entrySet();
		Iterator<Entry<String, String>> it=htSet.iterator();
		Entry<String, String> entry=null;
		while(it.hasNext()){
			entry=it.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		//随机排序遍历（不优化）
		/*Enumeration<String> e=ht.keys();
		String tmpKey="";
		while(e.hasMoreElements()){
			tmpKey=(String)e.nextElement();
			System.out.println(ht.get(tmpKey));
		}*/
	}

	public static void main(String[] args) {
		new Collection();
	}
}