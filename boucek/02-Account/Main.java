public class Main {
    
    public static void main(String[] args) {
        Account a1 = new Account("Josef Bouček");
        Account a2 = new Account("Petr Kořínek", 1000);
        info(a1);
        info(a2);
        System.out.println("-----------------------------------------");
        a1.addBalance(500);
        a2.addBalance(-100);
        System.out.println("Zůstatek po přidání 500 Kč k účtu " + a1.getAccountName() + ": " + a1.getBalance() + " Kč");
        System.out.println("Zůstatek po přidání -100 Kč k účtu " + a2.getAccountName() + ": " + a2.getBalance() + " Kč");
        System.out.println("-----------------------------------------");
        withdrawBalance(a1, 300);
        withdrawBalance(a2, -250);
        System.out.println("-----------------------------------------");
        withdrawBalanceFee(a1, -100);
        withdrawBalanceFee(a2, 600);
    }

    private static void info(Account account) {
        System.out.println("----------------------------------------");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account name: " + account.getAccountName());
        System.out.println("Balance: " + account.getBalance() + " Kč");
    }

    private static void withdrawBalance(Account account, int amount) {
        int withdrawn = account.withdrawBalance(amount);
        if (withdrawn != -1) {
            System.out.println("Výběr " + amount + " Kč na účet " + account.getAccountName() + ", zbytek na účtě: " + withdrawn + " Kč.");
        } else {
            System.out.println("Výběr " + amount + " Kč na účet " + account.getAccountName() + ": Nepodařilo se vybrat peníze.");
        }
    }

    private static void withdrawBalanceFee(Account account, int amount) {
        int withdrawn = account.withdrawBalanceFee(amount);
        if (withdrawn != -1) {
            System.out.println("Výběr " + amount + " Kč na účet " + account.getAccountName() + " s poplatkem " + Account.fee + " Kč, zbytek na účtě: " + withdrawn + " Kč.");
        } else {
            System.out.println("Výběr " + amount + " Kč na účet " + account.getAccountName() + " s poplatkem " + Account.fee + " Kč: Nepodařilo se vybrat peníze.");
        }
    }
}