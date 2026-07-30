package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapP02 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(101,"amansaurya");
        map.put(102,"amansaurya1");
        map.put(103,"amansaurya2");
        map.put(104,"amansaurya3");

        for(Map.Entry<Integer,String>  entry: map.entrySet())
        {
            System.out.println("key :"+entry.getKey());
            System.out.println("value :"+entry.getValue());
        }
        // only ------------key------ after that their valye by using get();
 for(Integer key:map.keySet())
 {
     System.out.println(key);
     System.out.println(map.get(key));
 }

 //using java 8

        map.forEach((k,v)->{
            System.out.println("key "+k+ " value "+v);
        });

     if(!map.containsKey(105))
     {
       map.put(104,"haria");
     }
   //work as f=same like if () upper bala;
     map.computeIfAbsent(107, k-> "sss");
        System.out.println(map);




    }
}
