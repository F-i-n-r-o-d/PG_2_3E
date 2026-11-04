class PolozkaEshopu {
    private String nazev;
    private double cena;
    private int skladovaZasoba;

    public PolozkaEshopu(String nazev, double cena, int skladovaZasoba) {
        this.nazev = nazev;
        this.cena = cena;
        this.skladovaZasoba = skladovaZasoba;
    }

    public void naskladnit(int pocet) {
        if (pocet > 0) {
            skladovaZasoba += pocet;
            System.out.println("Zbozi bylo naskladneno.");
        } else {
            System.out.println("Neplatny pocet kusu.");
        }
    }

    public double vypocetSlevy(double procenta) {
        if (procenta >= 0 && procenta <= 100) {
            return cena * (1 - procenta / 100);
        }

        System.out.println("Neplatna sleva.");
        return cena;
    }

    public double vypocetSlevyFixni(double sleva) {
        if (sleva >= 0 && sleva <= cena) {
            return cena - sleva;
        }

        System.out.println("Neplatna sleva.");
        return cena;
    }

    public void vypisInformace() {
        System.out.println("Nazev: " + nazev);
        System.out.println("Cena: " + cena + " Kc");
        System.out.println("Skladova zasoba: " + skladovaZasoba + " kusu");
    }
}