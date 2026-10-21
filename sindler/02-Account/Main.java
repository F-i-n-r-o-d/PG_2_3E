public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("123456", "John Doe", 1000.0);
        Account acc2 = new Account("789012", "Jane Smith", 2000.0);

        System.out.println("-----------------");
        System.out.println("Účet 1: " + acc1.getNumber() + ", Vlastník: " + acc1.getOwner() + ", Zůstatek: " + acc1.getMoney());
        System.out.println("Účet 2: " + acc2.getNumber() + ", Vlastník: " + acc2.getOwner() + ", Zůstatek: " + acc2.getMoney());
        System.out.println("-----------------");

        acc1.setOwner("Alice Johnson");

        System.out.println("-----------------");
        System.out.println("Účet 1: Vlastník byl změněn na: " + acc1.getOwner());
        System.out.println("-----------------");

        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        System.out.println("-----------------");
        System.out.println("Účet 1: " + acc1.getNumber() + ", Vlastník: " + acc1.getOwner() + ", Zůstatek: " + acc1.getMoney());
        System.out.println("Účet 2: " + acc2.getNumber() + ", Vlastník: " + acc2.getOwner() + ", Zůstatek: " + acc2.getMoney());
        System.out.println("-----------------");
    }
}
