package CustomException;

public class BankAccount {

    double balance= 2000;
    void withdraw(double amount) throws inSufficientBalanceException
    {
        if (amount>balance)
        {

               throw new inSufficientBalanceException("not enough balance");

        }

        System.out.println("withdraw succesfull");

        balance= balance- amount;


    }

    public static void main(String[] args) {

    }
}
