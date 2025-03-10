package lesson01.ex3;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000);

        account1.annuallnterestRate = 4.5;


        System.out.println("accaunt1 getMonthlyInterestRate() --->  " + account1.getMonthlyInterestRate());
        System.out.println("accaunt1 getMothlyInterest() --->  " + account1.getMonthlyInterest());
        System.out.println("accaunt1 wihtDraw() --->  " + account1.withdraw(2500));
        System.out.println("accaunt1 deposit() ---> " + account1.deposit(3000));
    }
}
