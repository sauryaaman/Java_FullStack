package ExecutcorSerrviceExample;

import java.util.concurrent.*;

public class callableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        Callable<Integer> task=()->
        {

            return 10*20;
        };
        Future <Integer> future=executorService.submit(task);
        System.out.println(future.get());
        executorService.shutdown();

    }
}
