package secao13.Aula144;

import secao13.Aula144.Entities.Account;
import secao13.Aula144.Entities.BusinessAccount;
import secao13.Aula144.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);


    }
}
