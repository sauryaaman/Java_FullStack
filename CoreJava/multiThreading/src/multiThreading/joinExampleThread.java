package multiThreading;


class Payment implements  Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
            System.out.println("Payment is  done");

        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}

public class joinExampleThread  {
    public static void main(String[] args) throws InterruptedException{
  Payment p1 = new Payment();
  Thread t1= new Thread(p1);
  t1.start();
        System.out.println("Reading  more info");

        t1.join();  // this lineis executed by main threa an will wait for excetuionfor  t1
        System.out.println("Notfication send to user");
    }
}
