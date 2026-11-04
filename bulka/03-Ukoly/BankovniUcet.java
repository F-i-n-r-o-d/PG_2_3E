public class BankovniUcet {
    //atributy
    private String cisloUctu;
    private String majitel;
    private double zustatek;

    //konstuktor 1
    public BankovniUcet(String cisloUctu, String majitel) {
        this.cisloUctu = cisloUctu;
        this.majitel = majitel;
        this.zustatek = 0.0;
    }
    //kostruktor 2
    public BankovniUcet(String cisloUctu, String majitel, double pocatecniVklad) {
        this.cisloUctu = cisloUctu;
        this.majitel = majitel;
        //pokud je castka kladna, ulozime ji, jinak 0.0
        if (pocatecniVklad > 0) {
            this.zustatek = pocatecniVklad;
        } else {
            this.zustatek = 0.0;
        }
    }
    //gettery
    public String getCisloUctu() {
        return this.cisloUctu;
    }
    public String getMajitel() {
        return this.majitel;
    }
    public double getZustatek() {
        return this.zustatek;
    }
    public void setMajitel(String novyMajitel) {
        //kontrola, aby jmeno nebylo prazdne
        if (novyMajitel != null && !novyMajitel.trim().isEmpty()) {
            this.majitel = novyMajitel;
        }
    }
    //metoda pro vklad hotovosti
    public void vloz(double castka) {
        if (castka > 0) {
            this.zustatek += castka;
        }
    }
    public boolean vyber(double castka) {
        if (castka > 0 && castka <= this.zustatek) {
            this.zustatek -= castka;
            return true;
        }
        return false;
    }
    public boolean vyber(double castka, double poplatek) {
        double celkem = castka + poplatek;

        if (castka > 0 && poplatek >= 0 && celkem <= this.zustatek) {
            this.zustatek -= celkem;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        BankovniUcet user1 = new BankovniUcet("0123445/0800", "Valentyn Bulka");
        BankovniUcet user2 = new BankovniUcet("9085652/0800", "Travis Scott", 1000.0);
        //1.
        System.out.println("-----VYCHOZI STAV UCTU-----");
        System.out.println("Ucet 1 (" + user1.getMajitel() + "): " + user1.getZustatek() + " Kc");
        System.out.println("Ucet 2 (" + user2.getMajitel() + "): " + user2.getZustatek() + " Kc\n");

        //2.
        System.out.println("-----TEST VKLADU-----");
        user1.vloz(500);
        System.out.println("Ucet 1 po vkladu 500 kc: " + user1.getZustatek() + "Kc\n");

        //3.
        System.out.println("-----TEST STANDARTNIHO VYBERU-----");
        boolean uspech1 = user2.vyber(200.0);
        System.out.println("Vyber 200 Kc uspesny: " + uspech1);
        System.out.println("Zustatek na uctu 2: " + user2.getZustatek() + "Kc\n");

        //4.
        System.out.println("-----TEST VYBERU S POPLATKEM-----");
        boolean uspech2 = user2.vyber(300.0, 20.0);
        System.out.println("Vyber 300 Kc s poplatkem 20 Kc uspesny: " + uspech2);
        System.out.println("Zustatek na uctu 2: " + user2.getZustatek() + "Kc\n");

        //5.
        System.out.println("-----TEST NEPOVOLENEHO VYBERU-----");
        boolean uspech3 = user2.vyber(2000.0);
        System.out.println("Pokus o vyberu 2000 Kc uspesny: " + uspech3);
        System.out.println("Konecny zustatek na uctu 2: "+ user2.getZustatek() + "Kc");
    }
}