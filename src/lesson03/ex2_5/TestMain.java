package lesson03.ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(10,"Kim Chen",'m');
        System.out.println(c1);

        Account a1 = new Account(12,c1,1000.0);
        System.out.println(a1);

        a1.setBalance(2000.0);
        System.out.println("balance :" + a1.getBalance());
        System.out.println("Customer name: " + a1.getCustomerName());
        a1.deposit(100.0);
        System.out.println("deposit balance: " + a1.getBalance());
        a1.withdraw(100.0);
        System.out.println("withdraw balance: " + a1.getBalance());
    }
}
