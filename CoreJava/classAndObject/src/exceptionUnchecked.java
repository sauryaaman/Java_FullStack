import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionUnchecked {
    public static void main(String[] args) {

//      try {
//          String name= "aman";
//          System.out.println(name.charAt(6));
//      }
//      catch(StringIndexOutOfBoundsException e){
//          System.out.println("invalid  index postio of astring  geeting" +
//                  "");
//      }

        Scanner sc = new Scanner(System.in);
       try {
           int age = sc.nextInt();
           System.out.println("age" + age);
       }
       catch(InputMismatchException e)
       {
           System.out.println("please enter the only number");
       }


    }



}
