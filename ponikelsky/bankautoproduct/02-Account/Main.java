public class Main {
    public static void main(String[] args){
        Account acc1 = new Account("Pepa Bouček", 128);
        Account acc2 = new Account("David Jusko", 256,5000);

        acc1.deposit(500);
        System.out.println(acc1.getAccountBalance());

        acc2.withdraw(1000);
        System.out.println(acc2.getAccountBalance());

        acc2.withdrawWithPoplatek(1000);
        System.out.println(acc2.getAccountBalance());

        acc2.withdraw(4000);
        System.out.println(acc2.getAccountBalance());

        System.out.println(acc1.getOwner());
            acc1.changeOwner("Martin Strana");
        System.out.println(acc1.getOwner());
    }
}
