package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mapdemo {

	public static void main(String[] args) {
	HashMap <String ,Integer> map = new HashMap();
	map.put("sumit", 1);
	map.put("sumitra", 2);
	System.out.println(map);
	//traverse - How to retrieve and print
	for(Map.Entry<String,Integer>priyamap:map.entrySet())
		System.out.println(priyamap.getKey()+""+priyamap.getValue());
	
	
	
	HashMap<String,ArrayList<Integer>> sumit= new HashMap();
	ArrayList<Integer> list= new ArrayList();
    list.add(500);
	list.add(1000);
	list.add(2000);
	sumit.put("priyanka",list);
	sumit.put("pari", list);
System.out.println(sumit);
}
}