package niscak.BankaAutoStore;

public class Bank {

    private final String accountNumber;
    private String ownerName;
    private double accountBalance;

    /* Konstruktory */

    public Bank(String accountNumber, String ownerName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (accountBalance < 0) {
            this.accountBalance = 0;
        } else {
            this.accountBalance = accountBalance;
        }
    }

    public Bank(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountBalance = 0;
    }

    /* Gettery */

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    /* Setter jmena majitele */

    public void setOwnerName(String ownerName) {
        String puvodniJmeno = this.ownerName;
        this.ownerName = ownerName;

        System.out.println("Jmeno majitele bylo zmeneno.");
        System.out.println("Puvodni jmeno: " + puvodniJmeno);
        System.out.println("Nove jmeno: " + this.ownerName);
    }

    /* Vklad */

    public void setBalanceDeposit(double accountBalance) {
        if (accountBalance > 0) {
            double puvodniZustatek = this.accountBalance;

            this.accountBalance += accountBalance;

            System.out.println("Prostredky byly uspesne vlozeny.");
            System.out.println("Vklad: +" + accountBalance + " Kc.");
            System.out.println("Puvodni zustatek: " + puvodniZustatek + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
        } else {
            System.out.println("Nelze vlozit nulovou nebo zapornou castku.");
            System.out.println("Pozadovany vklad: " + accountBalance + " Kc.");
            System.out.println("Aktualni zustatek zustava: " + this.accountBalance + " Kc.");
        }
    }

    /* Vyber bez poplatku */

    public void setBalanceVyber(double accountBalance) {
        if (accountBalance <= 0) {
            System.out.println("Nelze vybrat pozadovane prostredky.");
            System.out.println("Pozadovany vyber: " + accountBalance + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");

        } else if (accountBalance > this.accountBalance) {
            System.out.println("Nelze vybrat pozadovane prostredky.");
            System.out.println("Pozadovany vyber: " + accountBalance + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
            System.out.println("Chybi: " + (accountBalance - this.accountBalance) + " Kc.");

        } else {
            double puvodniZustatek = this.accountBalance;

            this.accountBalance -= accountBalance;

            System.out.println("Prostredky byly uspesne vybrany.");
            System.out.println("Vyber: -" + accountBalance + " Kc.");
            System.out.println("Puvodni zustatek: " + puvodniZustatek + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
        }
    }

    /* Vyber s poplatkem 10 % */

    public void setBalanceVyberPoplatek(double accountBalance) {
        if (accountBalance <= 0) {
            System.out.println("Nelze vybrat pozadovane prostredky.");
            System.out.println("Pozadovany vyber: " + accountBalance + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");

        } else if (accountBalance * 1.1 > this.accountBalance) {
            double poplatek = accountBalance * 0.1;
            double celkem = accountBalance * 1.1;

            System.out.println("Vyber nelze provest.");
            System.out.println("Pozadovany vyber: " + accountBalance + " Kc.");
            System.out.println("Poplatek 10 %: " + poplatek + " Kc.");
            System.out.println("Celkova potrebna castka: " + celkem + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
            System.out.println("Chybi: " + (celkem - this.accountBalance) + " Kc.");

        } else {
            double puvodniZustatek = this.accountBalance;
            double poplatek = accountBalance * 0.1;
            double celkem = accountBalance * 1.1;

            this.accountBalance -= celkem;

            System.out.println("Vyber s poplatkem byl uspesny.");
            System.out.println("Vybrana castka: -" + accountBalance + " Kc.");
            System.out.println("Poplatek 10 %: -" + poplatek + " Kc.");
            System.out.println("Celkem odeceteno: -" + celkem + " Kc.");
            System.out.println("Puvodni zustatek: " + puvodniZustatek + " Kc.");
            System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
        }
    }

    /* Vypis udaju o uctu */

    public void vypisUcet() {
        System.out.println("Cislo uctu: " + this.accountNumber);
        System.out.println("Majitel: " + this.ownerName);
        System.out.println("Aktualni zustatek: " + this.accountBalance + " Kc.");
    }

    /* Main */

    public static void main(String[] args) {

        Bank ucet1 = new Bank("001", "Jiri", 1000);
        Bank ucet2 = new Bank("002", "Petr", 500);
        Bank ucet3 = new Bank("003", "Marie");

        System.out.println("---------------------------------------------------------");
        System.out.println("                 POCATECNI STAV UCTU");
        System.out.println("---------------------------------------------------------");

        System.out.println("=========== Ucet 1 ===========");
        ucet1.vypisUcet();

        System.out.println("=========== Ucet 2 ===========");
        ucet2.vypisUcet();

        System.out.println("=========== Ucet 3 ===========");
        ucet3.vypisUcet();

        /* Testovani uctu 1 */

        System.out.println("---------------------------------------------------------");
        System.out.println("                 TESTOVANI UCTU 1");
        System.out.println("---------------------------------------------------------");

        System.out.println("------ Vklad 200 Kc ------");
        ucet1.setBalanceDeposit(200);

        System.out.println("------ Vyber 500 Kc ------");
        ucet1.setBalanceVyber(500);

        System.out.println("------ Vyber 1000 Kc s poplatkem ------");
        ucet1.setBalanceVyberPoplatek(1000);

        System.out.println("------ Konecny stav uctu 1 ------");
        ucet1.vypisUcet();

        /* Testovani uctu 2 */

        System.out.println("---------------------------------------------------------");
        System.out.println("                 TESTOVANI UCTU 2");
        System.out.println("---------------------------------------------------------");

        System.out.println("------ Neplatny vklad -1000 Kc ------");
        ucet2.setBalanceDeposit(-1000);

        System.out.println("------ Neplatny vyber -100 Kc ------");
        ucet2.setBalanceVyber(-100);

        System.out.println("------ Neplatny vyber s poplatkem -1000 Kc ------");
        ucet2.setBalanceVyberPoplatek(-1000);

        System.out.println("------ Konecny stav uctu 2 ------");
        ucet2.vypisUcet();

        /* Testovani uctu 3 */

        System.out.println("---------------------------------------------------------");
        System.out.println("                 TESTOVANI UCTU 3");
        System.out.println("---------------------------------------------------------");

        System.out.println("------ Vklad 1000 Kc ------");
        ucet3.setBalanceDeposit(1000);

        System.out.println("------ Vyber 500 Kc ------");
        ucet3.setBalanceVyber(500);

        System.out.println("------ Vyber 1000 Kc s poplatkem ------");
        ucet3.setBalanceVyberPoplatek(1000);

        System.out.println("------ Konecny stav uctu 3 ------");
        ucet3.vypisUcet();

        /* Dalsi testy */

        System.out.println("---------------------------------------------------------");
        System.out.println("                    DALSÍ TESTY");
        System.out.println("---------------------------------------------------------");

        System.out.println("------ Vklad nulove castky ------");
        ucet3.setBalanceDeposit(0);

        System.out.println("------ Vyber presne cely zustatek uctu 2 ------");
        ucet2.setBalanceVyber(500);

        System.out.println("------ Zmena jmena majitele uctu 1 ------");
        ucet1.setOwnerName("Jan");

        System.out.println("------ Konecny prehled vsech uctu ------");

        System.out.println("=========== Ucet 1 ===========");
        ucet1.vypisUcet();

        System.out.println("=========== Ucet 2 ===========");
        ucet2.vypisUcet();

        System.out.println("=========== Ucet 3 ===========");
        ucet3.vypisUcet();

    }
}


