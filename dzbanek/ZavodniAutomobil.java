class ZavodniAutomobil {
    private String znacka;
    private double rychlost;
    private double maximalniRychlost;
    private double palivo;

    public ZavodniAutomobil(String znacka, double maximalniRychlost,
                            double palivo) {
        this.znacka = znacka;
        this.rychlost = 0;
        this.maximalniRychlost = maximalniRychlost;
        this.palivo = palivo;
    }

    public void zrychlit(double hodnota) {
        if (hodnota > 0 && palivo > 0) {
            rychlost += hodnota;

            if (rychlost > maximalniRychlost) {
                rychlost = maximalniRychlost;
            }

            System.out.println("Nova rychlost: " + rychlost + " km/h");
        } else {
            System.out.println("Nelze zrychlit.");
        }
    }

    public void brzdit() {
        rychlost = 0;
        System.out.println("Automobil zastavil.");
    }

    public void spotrebovatPalivo(double mnozstvi) {
        if (mnozstvi > 0 && mnozstvi <= palivo) {
            palivo -= mnozstvi;
        } else {
            System.out.println("Nedostatek paliva.");
        }
    }

    public void vypisInformace() {
        System.out.println("Znacka: " + znacka);
        System.out.println("Rychlost: " + rychlost + " km/h");
        System.out.println("Maximalni rychlost: " + maximalniRychlost + " km/h");
        System.out.println("Palivo: " + palivo + " l");
    }
}