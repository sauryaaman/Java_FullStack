package ExecutcorSerrviceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmailTask implements  Runnable
{
    String studentEmail;
    EmailTask(String studentEmail)
    {
        this.studentEmail=studentEmail;
    }


    @Override
    public void run() {
        System.out.println("sending email to "+ studentEmail+ " by"+Thread.currentThread().getName());
    }
}

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        String[] email={
                "amansa@gmail.com",
                "amanfnda@gmail.com",
                "amfbwansa@gmail.com",
                "afjweifwmansa@gmail.com",
                "affnwmansa@gmail.com",
                "afnwmansa@gmail.com",
                "abfmansa@gmail.com",
                "anfrj;mansa@gmail.com",
        };
        for(String e:email)
        {
            executorService.submit(new EmailTask(e)); // both are same
            executorService.execute(new EmailTask(e));
        }
        executorService.shutdown();
    }
}
