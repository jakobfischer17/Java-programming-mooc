ex 72.1

import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account jakobsAccount = new Account("Jakob's account", 100.0);
        jakobsAccount.deposit(20.0);
        System.out.println(jakobsAccount);    }

}


ex 72.2

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsAccount = new Account ("Matt's account", 1000.0);
        Account myAccount = new Account ("My account", 0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }

}


ex 72.3:


public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);
        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
        
    }
public static void transfer(Account from, Account to, double howMuch) {
from.withdrawal(howMuch);
to.deposit(howMuch);}

}
