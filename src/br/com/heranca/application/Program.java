package br.com.heranca.application;

import br.com.heranca.entities.Account;
import br.com.heranca.entities.BussinesAccount;
import br.com.heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc =new Account(1001, "Alex", 0.0);

        BussinesAccount bacc =new BussinesAccount(1008, "Maria", 0.0, 500.00);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003,"bob",0.0,200.00);
        Account acc3 = new SavingsAccount(1004,"Anna", 0.0, 0.1);

        // DOWNCASTIMG



    }
}
