package List;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

         List<Integer> list= new ArrayList<Integer>();
         list.add(10);
        list.add(20);

        list.add(30);

        list.add(40);

        list.add(50);


        System.out.println(list);

        //add 60 at 2nd position
        list.add(2,60);
        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        System.out.println(list.contains(40));

        System.out.println(list.size());



    }
}
