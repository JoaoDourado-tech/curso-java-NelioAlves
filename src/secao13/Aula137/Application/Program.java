package secao13.Aula137.Application;

import secao13.Aula137.Entities.Account;
import secao13.Aula137.Entities.BusinessAccount;
import secao13.Aula137.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0); //Método Original
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01); //Upcasting feito
        acc2.withdraw(200.0); //Sobrescrição do Método próprio
        System.out.println(acc2.getBalance());
    }
}
