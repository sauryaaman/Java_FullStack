package MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(101,"aman");
        map.put(10,"nds");
        map.put(15,"cd");
        map.put(11,"vf");
        System.out.println(map);
    }
}
