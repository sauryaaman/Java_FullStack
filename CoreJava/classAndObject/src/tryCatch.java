public class tryCatch {
    public static void main(String[] args) {

    try
    {
        System.out.println("1");

        int arr[] = new int[3];
        arr[5]=5;
        System.out.println(10/0);
        System.out.println("2");
    }
    catch(ArithmeticException e)
    {
        System.out.println("exception handeled arithmetic");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("exception handeled arrsay bala");
    }
    catch(RuntimeException e)
    {
        System.out.println("exception handeled");
    }



    catch(Exception e)
    {
        System.out.println("exception handeled");
    }
        System.out.println("3");
    }
}
