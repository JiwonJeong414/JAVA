class Account {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        acct.deposit(10); // balance = 10
        acct.printBalance();
        acct.deposit(20); // balance = 30
        acct.printBalance();
        acct.applyInterest(10); // balance = 33 after 10% interest was applied
        acct.printBalance();
        acct.withdraw(20); // balance = 13
        acct.printBalance();
        acct.withdraw(20); // should print "Insufficient fund"
        acct.printBalance();
    }
}

class BankAccount {
    int balance;

    void deposit(int balance) {
        this.balance += balance;
    }

    void applyInterest(int balance) {
        this.balance = this.balance + (this.balance / balance);
    }

    void withdraw(int balance) {
        if ((this.balance - balance) < 0) {
            System.out.println("Insufficient fund");
        } else {
            this.balance -= balance;
        }
    }

    void printBalance() {
        System.out.println("balance: $" + this.balance);
    }
}