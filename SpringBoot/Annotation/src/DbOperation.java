public class DbOperation {

    @LogExecutionTime
    public void readData() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("task Completed");
    }
}
