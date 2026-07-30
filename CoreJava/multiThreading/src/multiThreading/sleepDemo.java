package multiThreading;

class MyThread4 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("thread ruunig"+ i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw  new RuntimeException(e);
            }

        }
    }
}


public class sleepDemo {
    public static void main(String[] args) {
     MyThread4 t3= new MyThread4();
     t3.start();
        System.out.println("maion thread");
    }
}
