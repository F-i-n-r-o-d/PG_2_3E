public class zavodni_auto {
    //zapouzdreni atributu
    private String znacka;
    private double aktualniRychlost;
    private double maxRychlost;
    private double palivo;

    //konstruktor 1 - znacka + max rychlost
    public zavodni_auto(String znacka, double maxRychlost) {
        this.znacka = znacka;
        this.maxRychlost = maxRychlost;
        this.aktualniRychlost = 0.0;
        this.palivo = 20.0;
    }

    //konstruktor 2 - se zadanou hladinou paliva
    public zavodni_auto(String znacka, double maxRychlost, double pocatecniPalivo) {
        this.znacka = znacka;
        this.maxRychlost = maxRychlost;
        this.aktualniRychlost = 0.0;
        if (pocatecniPalivo >= 0) {
            this.palivo = pocatecniPalivo;
        } else {
            this.palivo = 0.0;
        }
    }
    // gettery read-only
    public String getZnacka() {
        return this.znacka;
    }
    public double getAktualniRychlost() {
        return this.aktualniRychlost;
    }
    public double getMaxRychlost() {
        return this.maxRychlost;
    }
    public double getPalivo() {
        return this.palivo;
    }
    //setter - upravit lze jenom palivo
    public void setPalivo(double novePalivo) {
        if (novePalivo >= 0) {
            this.palivo = novePalivo;
        }
    }
    public void zrychli() {
        if (this.palivo >= 0.5 && this.aktualniRychlost < this.maxRychlost) {
            this.aktualniRychlost += 10.0;
            if (this.aktualniRychlost > this.maxRychlost) {
                this.aktualniRychlost = this.maxRychlost;
            }
            this.palivo -= 0.5;
        }
    }
    public void zrychli(double oKolik) {
        if (oKolik > 0 && this.palivo >= 0.5 && this.aktualniRychlost < this.maxRychlost) {
            this.aktualniRychlost += oKolik;
            if (this.aktualniRychlost > this.maxRychlost) {
                this.aktualniRychlost = this.maxRychlost;
            }
            this.palivo -= 0.5;
        }
    }
    public void zastav() {
        this.aktualniRychlost = 0.0;
    }
    //testovani
    public static void main(String[] args) {
        zavodni_auto auto1 = new zavodni_auto("Ferrari", 320.0);
        zavodni_auto auto2 = new zavodni_auto("Skoda", 180.0, 1.0);

        System.out.println("-----VYCHOZI STAV-----");
        System.out.println(auto1.getZnacka() + " - Rychlost: " + auto1.getAktualniRychlost() + " km/h, Palivo: " + auto1.getPalivo() + " l");
        System.out.println(auto2.getZnacka() + " - Rychlost: " + auto2.getAktualniRychlost() + " km/h, Palivo: " + auto2.getPalivo() + " l\n");

        System.out.println("-----TEST VYCHOZIHO ZRYCHLENI-----");
        auto1.zrychli();
        System.out.println(auto1.getZnacka() + " po zrychli(): Rychlost = " + auto1.getAktualniRychlost() + " km/h, Palivo = " + auto1.getPalivo() + " l\n");

        System.out.println("-----TEST NASTAVITELNEHO ZRYCHLENI-----");
        auto1.zrychli(150.0);
        System.out.println(auto1.getZnacka() + " po zrychli(150): Rychlost = " + auto1.getAktualniRychlost() + " km/h, Palivo = " + auto1.getPalivo() + " l\n");

        System.out.println("--- TEST PŘEKROČENÍ MAXIMA ---");
        auto1.zrychli(200.0); 
        System.out.println(auto1.getZnacka() + " po pokusu prekrocit max: Rychlost = " + auto1.getAktualniRychlost() + " km/h (Max: " + auto1.getMaxRychlost() + ")\n");

        System.out.println("-----TEST SPOTREBY A VYCERPANI PALIVA-----");
        auto2.zrychli(50.0);
        auto2.zrychli(50.0);
        System.out.println(auto2.getZnacka() + " po 2 zrychlenIch: Rychlost = " + auto2.getAktualniRychlost() + " km/h, Palivo = " + auto2.getPalivo() + " l\n");

        auto2.zrychli(50.0);
        System.out.println(auto2.getZnacka() + " po pokusu jet bez paliva: Rychlost = " + auto2.getAktualniRychlost() + " km/h\n");

        System.out.println("-----TEST ZASTAVENI-----");
        auto1.zastav();
        System.out.println(auto1.getZnacka() + " po zastav(): Rychlost = " + auto1.getAktualniRychlost() + " km/h");
    }
}
