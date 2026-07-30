package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> std= new HashMap<>();
        std.put(101,"aman");
        std.put(102,"rman");
        std.put(103,"kman");
        std.put(104,"gman");

        System.out.println(std);

        Set<Integer> Integers= std.keySet();
        System.out.println(Integers);
        Set<Map.Entry<Integer,String>> entries= std.entrySet();
        System.out.println(entries);
 //traversal map
        Iterator<Map.Entry<Integer,String>> it =entries.iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> next=it.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());

        }

    }
}
