public class Account {
    private static int totalAccounts = 0; //Takhle mi to připadá více přehledné, když ten account number je postupný a ne, že to udělá uživatel.
    public static int fee = 300;
    
    private final int ACCOUNT_NUMBER;
    private String accountName;
    private int balance;

    public Account(String accountName) {
        totalAccounts++;
        this.ACCOUNT_NUMBER = totalAccounts;
        this.accountName = accountName;
        this.balance = 0;
    }

    public Account(String accountName, int balance) {
        totalAccounts++;
        this.ACCOUNT_NUMBER = totalAccounts;
        this.accountName = accountName;
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public int getAccountNumber() {
        return this.ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getBalance() {
        return this.balance;
    }

    public void addBalance (int balance) {
        if (balance > 0) {
            this.balance += balance;
        }
    }

    public int withdrawBalance (int withdraw) {
        if (withdraw > 0 && withdraw <= this.balance) {
            this.balance -= withdraw;
            return withdraw;
        }
        return -1;
    }

    public int withdrawBalanceFee (int withdraw) {
        if (withdraw > 0 && (withdraw + fee) <= this.balance) {
            this.balance -= (withdraw + fee);
            return withdraw;
        }
        return -1;
    }

}
