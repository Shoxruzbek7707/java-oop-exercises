package lesson01.ex3;

class Account {
    int id;
    double balance;
    double annuallnterestRate;

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annuallnterestRate = 0;
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    double getMonthlyInterestRate(){
        return annuallnterestRate / 12;
    }

    double getMonthlyInterest(){
        return  balance * (annuallnterestRate / 12);
    }

    double withdraw(double amount){
        return  balance - amount;
    }

    double deposit(double amount){
        return  balance + amount;
    }
}
