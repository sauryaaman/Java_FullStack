package CustomException;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try
        {
            account.withdraw(6000);
        }
        catch(inSufficientBalanceException e){
            System.out.println("insufficenit balance");
        }

    }
}
