import java.util.Scanner;

public class throwDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc. nextInt();
         if (age <18){
             throw  new ArithmeticException("Age must be  grated than 18");
         }


    }
}
