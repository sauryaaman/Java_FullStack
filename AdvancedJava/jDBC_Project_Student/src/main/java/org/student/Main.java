package org.student;



import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        StudentServices service= new StudentServices();
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("-------------------------");
            System.out.println("Enter  your choice");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. exit");

            System.out.println(" enter  your choice");
            choice= sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("enter Student Id: ");
                    int id= sc.nextInt();

                    sc.nextLine();

                    System.out.println("enter the Student Name: ");
                    String  name= sc.nextLine();

                    System.out.println("enter the Student email: ");
                    String email = sc.nextLine();

                    System.out.println("enter th Student course");
                    String course= sc.nextLine();

                    System.out.println("enter the  Student marks");
                    double marks= sc.nextDouble();

                    Student student= new Student(id, name, email,course,marks);
                    service.addStudent(student);
                    break;
                case 2:
                    service.viewAllStudent();
                    break;
                case 3:
                    System.out.println("enter the Student ID: ");
                     int newid= sc.nextInt();
                     Student s=service.searchStudent(newid);

                     if(s!= null) {
                         s.printStudentData();
                     }

                     break;
                case 4:
                    System.out.println("Enter the Stduent id which you want to update");
                    int update_id= sc.nextInt();
                    Student update_student= service.searchStudent(update_id);
                    update_student.printStudentData();
                   try
                   {
                       if (update_student!= null){
                           System.out.println("enter choice which you want to  update");
                           System.out.println("1. Update Name");
                           System.out.println("2. Update Email");
                           System.out.println("3. Update Course");
                           System.out.println("4. Update marks");
                           int update_choice= sc.nextInt();
                           sc.nextLine();
                           switch (update_choice)
                           {
                               case 1:
                                   System.out.println("enter the Name");
                                   String update_name=sc.nextLine();
                                   update_student.setName(update_name);
                                   service.updateStudent(update_student);
                                   break;
                               case 2:
                                   System.out.println("enter the Email");
                                   String update_email=sc.nextLine();
                                   update_student.setEmail(update_email);
                                   service.updateStudent(update_student);
                                   break;
                               case 3:
                                   System.out.println("enter the Course");
                                   String update_Course=sc.nextLine();
                                   update_student.setName(update_Course);
                                   service.updateStudent(update_student);
                                   break;
                               case 4:
                                   System.out.println("enter the marks");
                                   String update_marks=sc.nextLine();
                                   update_student.setName(update_marks);
                                   service.updateStudent(update_student);
                                   break;
                               default:
                                   System.out.println(" Invalid CHoice ! ,Please choose  the choice from the above Number, ");
                                   break;




                           }

                       }else {
                           System.out.println("Stduent Not Found which you want to update ");
                       }
                   } catch (Exception e) {
                       throw new RuntimeException(e);
                   }
                   break;




                case 5:
                    System.out.println("Enter  the Stduent id which you want to delete");
                    int dlt_id= sc.nextInt();
                    service.deleteStudent(dlt_id);
                    break;

                case 6:
                    System.out.println("Applicationn CLodes");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }

        }while (choice!=6);
        sc.close();




    }
}
