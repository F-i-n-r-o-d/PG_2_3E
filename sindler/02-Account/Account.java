public class Account {
    private final String number;
    private String owner;
    private double money;

    public Account(String number, String owner, double money) {
        this.number = number;
        this.owner = owner;
        this.money = 0.0;
    }

    public Account(String number, String owner, double money, double startingMoney) {
        this.number = number;
        this.owner = owner;
        if (startingMoney > 0) {
            this.money = startingMoney;
        } else {
            this.money = 0.0;
        }
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public double getMoney() {
        return money;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        System.out.println("Vlastník účtu byl změněn na: " + owner);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("Na účet " + number + " bylo vloženo: " + amount);
        } else {
            System.out.println("Chyba: Nelze vložit zápornou částku.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && money >= amount) {
            money -= amount;
            System.out.println("Z účtu " + number + " bylo vybráno: " + amount);
        } else {
            System.out.println("Chyba: Nelze vybrat částku, která překračuje zůstatek účtu.");
        }
    }
}