package day8;
import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHashMapExample {

public static void main(String[] args) {
ConcurrentHashMap<String, Integer> phones = new ConcurrentHashMap<String, Integer>();
phones.put("aaa", 123);
phones.put("BBB", 567);
phones.put("ccc", 567);
System.out.println(phones);
   Iterator<Map.Entry<String,Integer>> itr= phones.entrySet().iterator();
   Map.Entry<String,Integer> set = (Map.Entry<String,Integer>) itr.next();
   System.out.println(set.getKey()+" "+set.getValue());
   {
   phones.forEach((key,value)->System.out.println(key+" "+value));
   }


}

}
