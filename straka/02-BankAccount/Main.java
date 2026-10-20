public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("123456/0100", "Jan Novák");

        BankAccount a2 = new BankAccount("987654/0300", "Eva Svobodová", 5000);

        System.out.println("Účet 1: " + a1.getOwnerName() + ", zůstatek " + a1.getBalance());
        System.out.println("Účet 2: " + a2.getOwnerName() + ", zůstatek " + a2.getBalance());

        a1.deposit(1000);
        System.out.println("Po vkladu 1000 na účet 1: " + a1.getBalance());

        a1.deposit(-500);
        System.out.println("Po záporném vkladu: " + a1.getBalance());

        boolean ok = a2.withdraw(2000);
        System.out.println("Výběr 2000 z účtu 2 povedl se? " + ok + ", zůstatek " + a2.getBalance());

        ok = a2.withdraw(2000, 50);
        System.out.println("Výběr 2000 s poplatkem 50 povedl se? " + ok + ", zůstatek " + a2.getBalance());

        ok = a2.withdraw(10000);
        System.out.println("Výběr 10000 povedl se? " + ok + ", zůstatek " + a2.getBalance());

        a1.setOwnerName("Jan Novák ml.");
        System.out.println("Nový majitel účtu 1: " + a1.getOwnerName());
    }
}