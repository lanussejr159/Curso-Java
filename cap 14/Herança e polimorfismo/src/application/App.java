package application;

import entities.Account;
import entities.BusinessAccount;
//import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Account acc = new Account(12, "Pedro", 50000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc1 = new SavingsAccount(14, "Picamansa", 1000.0, 0.1);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(13, "Zezin", 1000.0, 500.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        /*  //instanciaçoes de novas contas.
        Account acc = new Account(12, "Pedro", 50000.0);
        BusinessAccount bacc = new BusinessAccount(12, "Pedro", 50000.0, 100000.0);
        
        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(13, "Zezin", 2.0, 100.0);
        Account acc3 = new SavingsAccount(14, "Picamansa", 10000000000000000.0, 0.1);

        //downcasting
        //se a conta 3 for uma instancia de SavingsAccount, ele faz o
        //update do balance e printa esse update
        //sucesso
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc4 = (SavingsAccount) acc3;
            acc4.updateBalance();
            System.out.println(acc4);
        }
    
        //downcasting
        //se a conta 3 for uma instancia de BusinessAccount, ele adiciona
        //um emprestimo ao total do valor da conta
        //falha
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc4 = (BusinessAccount) acc3;
            acc4.loan(200.0);
            System.out.println(acc4);
        }

        System.out.println(acc);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);*/
    }
}
