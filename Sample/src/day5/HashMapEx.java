package day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> phonebook = new HashMap<>();
		phonebook.put("mnop", 1002);
		phonebook.put("dfew", 7839);
		phonebook.put("sjdk", 1934);
		phonebook.put("qppk", 2994);
		System.out.println(phonebook);
		Set set =phonebook.entrySet();
		Iterator itr=set.iterator();
		//search
		System.out.println(phonebook.get("xyz"));
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(phonebook.values());
		System.out.println();
		
		//reset to entry
		itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		

	}

}