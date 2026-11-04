public class polozka_e {
    
    private String nazev;
    private double cena;
    private double sleva;

    // konstruktor 1 - polozka bez slevy
    public polozka_e(String nazev, double cena) {
        this.nazev = nazev;
        if (cena > 0) {
            this.cena = cena;
        } else {
            this.cena = 0.0;
        }
        this.sleva = 0.0;
    }

    // konstruktor 2 - zadana sleva v procentech
    public polozka_e(String nazev, double cena, double sleva) {
        this.nazev = nazev;
        if (cena > 0) {
            this.cena = cena;
        } else {
            this.cena = 0.0;
        }

        if (sleva >= 0 && sleva <= 100) {
            this.sleva = sleva;
        } else {
            this.sleva = 0.0;
        }
    }

    // gettery a settery
    public String getNazev() {
        return this.nazev;
    }

    public void setNazev(String novyNazev) {
        if (novyNazev != null && !novyNazev.trim().isEmpty()) {
            this.nazev = novyNazev;
        }
    }

    public double getCena() {
        return this.cena;
    }

    public void setCena(double novaCena) {
        if (novaCena > 0) {
            this.cena = novaCena;
        }
    }

    public double getSleva() {
        return this.sleva;
    }

    public void setSleva(double novaSleva) {
        if (novaSleva >= 0 && novaSleva <= 100) {
            this.sleva = novaSleva;
        }
    }

    //metody pro vypocet ceny po sleve

    // A - po sleve
    public double spocitejCenuPoSleve() {
        return this.cena * (1.0 - (this.sleva / 100.0));
    }

    // B - sleva + kupon
    public double spocitejCenuPoSleve(double kuponKc) {
        double cenaPoProcentech = spocitejCenuPoSleve();
        if (kuponKc > 0) {
            double vysledek = cenaPoProcentech - kuponKc;
            return vysledek > 0 ? vysledek : 0.0;
        }
        return cenaPoProcentech;
    }

    // hlavni testovaci metoda

    public static void main(String[] args) {
        polozka_e zbozi1 = new polozka_e("Herni mys", 1200.0);
        polozka_e zbozi2 = new polozka_e("Mechanicka klavesnice", 2500.0, 20.0);

        System.out.println("-----VYCHOZI STAV POLOZEK-----");
        System.out.println(zbozi1.getNazev() + " | Puvodni cena: " + zbozi1.getCena() + " Kc | Sleva: " + zbozi1.getSleva() + " %");
        System.out.println("Konecna cena: " + zbozi1.spocitejCenuPoSleve() + " Kč\n");

        System.out.println(zbozi2.getNazev() + " | Puvodni cena: " + zbozi2.getCena() + " Kc | Sleva: " + zbozi2.getSleva() + " %");
        System.out.println("Konecna cena (po 20% sleve): " + zbozi2.spocitejCenuPoSleve() + " Kc\n");

        System.out.println("-----TEST PRETIZENE METODY S KUPONEM-----");
        double cenaSKuponem = zbozi2.spocitejCenuPoSleve(300.0);
        System.out.println("Klavesnice po 20% sleve a kuponu 300 Kc: " + cenaSKuponem + " Kc\n");

        System.out.println("-----TEST ZMENY SLEVY (SETTER)-----");
        zbozi1.setSleva(15.0);
        System.out.println(zbozi1.getNazev() + " nova cena po 15% sleve: " + zbozi1.spocitejCenuPoSleve() + " Kc");

        zbozi1.setSleva(150.0);
        System.out.println("Sleva po pokusu o neplatnych 150 %: " + zbozi1.getSleva() + " % (zustala 15 %)");
    }
}
