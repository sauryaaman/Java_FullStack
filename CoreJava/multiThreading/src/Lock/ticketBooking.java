package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class bookingSeat
{
    int availableSeats=1;
   Lock lock = new ReentrantLock();
   void bookTicket(String username)
   {
       boolean locked= lock.tryLock();
       if(locked)
       {
           try
           {
               if(availableSeats>0)
               {
                   System.out.println(username+ " is booking ticket");
                   Thread.sleep(5000);
                   availableSeats--;
                   System.out.println(username+" booking sucessfull");
               }
               else
               {
                   System.out.println(username+ " no seat availabe");
               }

           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           } finally
           {
               lock.unlock();
           }
       }
       else
       {
           System.out.println(username+" could not get lock try again");
       }
   }

}

class TicketThread extends  Thread
{
    bookingSeat bookingSeat;
    String Username;
    TicketThread(bookingSeat bookingSeat,String Username)
    {
        this.bookingSeat=bookingSeat;
        this.Username= Username;

    }

    @Override
    public void run() {
        bookingSeat.bookTicket(Username);
    }
}




public class ticketBooking {


    public static void main(String[] args) {

     bookingSeat b1 = new bookingSeat();
      TicketThread t1 = new TicketThread(b1, "aman");
      TicketThread t2= new TicketThread(b1, "saurya");
      t1.start();
      t2.start();

    }
}
