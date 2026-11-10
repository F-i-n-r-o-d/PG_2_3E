class BankovniUcet {
    private String cisloUctu;
    private String majitel;
    private double zustatek;

    public BankovniUcet(String cisloUctu, String majitel) {
        this.cisloUctu = cisloUctu;
        this.majitel = majitel;
        this.zustatek = 0;
    }

    public void vlozit(double castka) {
        if (castka > 0) {
            zustatek += castka;
            System.out.println("Vklad byl uspesny.");
        } else {
            System.out.println("Neplatna castka.");
        }
    }

    public boolean vybrat(double castka) {
        if (castka > 0 && castka <= zustatek) {
            zustatek -= castka;
            System.out.println("Vyber byl uspesny.");
            return true;
        } else {
            System.out.println("Nedostatek penez nebo neplatna castka.");
            return false;
        }
    }

    public void vypisInformace() {
        System.out.println("Cislo uctu: " + cisloUctu);
        System.out.println("Majitel: " + majitel);
        System.out.println("Zustatek: " + zustatek + " Kc");
    }
}