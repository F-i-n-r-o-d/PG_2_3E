
public class Account {

    // 1. Privátní atributy
    private String owner;
    private final int ACCNUMBER;
    private int balance;

    // 2. Hlavní konstruktor
    public Account(String owner, int ACCNUMBER){
        this.owner = owner;
        this.ACCNUMBER = ACCNUMBER;
        this.balance = 0;
    }

    //3. Přetížený konstruktor
    public Account(String owner, int ACCNUMBER, int balance){
        this.owner = owner;
        this.ACCNUMBER = ACCNUMBER;
        if (balance < 0){
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    //gettery
    public int getAccountNumber() {
        return this.ACCNUMBER;
    }

    public int getAccountBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner;
    }

    //setter
    public void changeOwner(String owner){
        this.owner = owner;
        System.out.println("Změna vlastníka účtu na: " + this.owner);
    }
    //metody
    //deposit
    public void deposit(int hotovost){
        if (hotovost < 0) {
            System.out.println("Neplatný vklad");
        } else {
            balance += hotovost;
            System.out.println("Úspěšně vloženo");
        }
    }
    //výběr
    public void withdraw(int hotovost){
        if(hotovost < 0){
            System.out.println("Neplatný výběr");
        }else if(hotovost > balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= hotovost;
            System.out.println("Úspěšně vybráno");
        }
    }
    //výběr s poplatkem 5%
    public void withdrawWithPoplatek(int hotovost){
        if(hotovost*1.05 < 0){
            System.out.println("Neplatný výběr");
        }else if(hotovost*1.05 > balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= hotovost*1.05;
            System.out.println("Úspěšně vybráno");
        }
    }
}
