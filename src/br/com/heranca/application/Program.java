package br.com.heranca.application;

import br.com.heranca.entities.Account;
import br.com.heranca.entities.BusinessAccount;
import br.com.heranca.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /**
        Account acc =new Account(1001, "Alex", 0.0);

        BusinessAccount bacc =new BusinessAccount(1008, "Maria", 0.0, 500.00);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"bob",0.0,200.00);
        Account acc3 = new SavingsAccount(1004,"Anna", 0.0, 0.1);

        // DOWNCASTIMG

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
         **/

        // EX. OVERIDE E SPER

        /**
        Account acc1 = new Account(1001, "Alex", 1000.00);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    **/

        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1000,"Maria",100.0,100.0));
        list.add(new BusinessAccount(1001,"Joao",200.0,100.0));
        list.add(new SavingsAccount(1002,"Bob",300.0,0.1));
        list.add(new SavingsAccount(1002,"Bob",400.0,0.1));


        double sum = 0.0;

        for(Account acc : list){
         sum +=   acc.getBalance();
        }

        System.out.println(sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account account : list) {
            System.out.println(account.getBalance());
        }

        





        

    }
}
