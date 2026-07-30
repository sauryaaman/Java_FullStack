package multiThreading;

class MyThread extends Thread{
    @Override
    public void run() {

       for (int i = 0; i<5; i++)
       {
           System.out.println(Thread.currentThread().getName());
           System.out.println("child thread"+ i);
       }
    }
}


class MyThread2 implements Runnable
{
    @Override
    public void run() {
      for(int i = 1; i<6;i++)
      {
          System.out.println("Creating thread by runnable" + i);
      }
    }
}




public class ThreadTest {
    public static void main(String[] args) {

        MyThread t1= new MyThread();  //creat object of thread
        t1.run(); //    only run the run() method not creatd the thtread
        t1.start();  // thrrwad created an run the  run() method


        MyThread2 t2= new MyThread2();
        Thread thread = new Thread(t2);
        thread.start();


        for (int i=0; i< 5; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("main thrad"+ i);
        }
    }

}
