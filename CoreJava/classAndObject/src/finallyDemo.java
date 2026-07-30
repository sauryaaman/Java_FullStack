public class finallyDemo {

    public static void main(String[] args) {
        try {
            double res= 20/0;
            System.out.println(res);
        }
        catch( ArithmeticException e){
            System.out.println("Exception handel");
        }
        finally{
            System.out.println("finally block excetued");
            //connection close ke lye v or  v bhuat ciz ke lye finally   blocl use hota h bhia

        }
    }
}
