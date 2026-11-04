




package niscak.BankaAutoStore;

public class Car2 {

    private String brand;
    private int currentSpeed;
    private int maxSpeed;
    private double fuelAmount;

    /* Konstruktory */

    // Vychozi palivo 20 litru
    public Car2(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.fuelAmount = 20.0;
    }

    // Konstruktor se zadanou hodnotou paliva
    public Car2(String brand, int maxSpeed, double fuelAmount) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.fuelAmount = fuelAmount;
    }

    /* Gettery */

    public String getBrand() {
        return brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    /* Setter paliva */

    public void setFuelAmount(double fuelAmount) {
        if (fuelAmount < 0) {
            System.out.println("Nelze nastavit zapornou hodnotu paliva."
            );
            System.out.println("Zadana hodnota: " + fuelAmount + " litru."
            );
            System.out.println("Aktualni stav paliva zustava: " + this.fuelAmount + " litru."
            );
        } else {
            double puvodniPalivo = this.fuelAmount;
            this.fuelAmount = fuelAmount;

            System.out.println("Palivo bylo uspesne natankováno.");
            System.out.println("Puvodni stav: " + puvodniPalivo + " litru.");
            System.out.println("Nova hodnota: " + this.fuelAmount + " litru.");
            System.out.println("Zmena: +" + (this.fuelAmount - puvodniPalivo) + " litru."
            );
        }
    }

    /* Zrychleni o 10 km/h */

    public void currentSpeedPoZrychleniO10() {
        int increase = 10;

        if (this.currentSpeed + increase > this.maxSpeed) {
            int prekroceni = this.currentSpeed + increase - this.maxSpeed;

            System.out.println("Auto nemuze zrychlit.");
            System.out.println("Aktualni rychlost: " + this.currentSpeed + " km/h.");
            System.out.println("Pozadovana rychlost: "
                    + (this.currentSpeed + increase) + " km/h.");
            System.out.println("Maximalni rychlost: " + this.maxSpeed + " km/h.");
            System.out.println("Maximalni rychlost by byla prekrocena o "
                    + prekroceni + " km/h.");
        } else if (this.fuelAmount < 0.5) {
            System.out.println("Auto nemuze zrychlit kvuli nedostatku paliva.");
            System.out.println("Aktualni palivo: " + this.fuelAmount + " litru.");
            System.out.println("Pro zrychleni je potreba 0.5 litru.");
            System.out.println("Aktualni rychlost zustava: "
                    + this.currentSpeed + " km/h.");
        } else {
            int puvodniRychlost = this.currentSpeed;
            double puvodniPalivo = this.fuelAmount;

            this.currentSpeed += increase;
            this.fuelAmount -= 0.5;

            System.out.println("Auto uspesne zrychlilo.");
            System.out.println("Zrychleni: +" + increase + " km/h.");
            System.out.println("Puvodni rychlost: " + puvodniRychlost + " km/h.");
            System.out.println("Aktualni rychlost: "
                    + this.currentSpeed + " km/h.");
            System.out.println("Spotrebovane palivo: 0.5 litru.");
            System.out.println("Puvodni palivo: " + puvodniPalivo + " litru.");
            System.out.println("Aktualni palivo: "
                    + this.fuelAmount + " litru.");
        }
    }

    /* Zrychleni o zadanou hodnotu */

    public void setCurrentSpeedZrychleni2(int increase) {
        if (increase <= 0) {
            System.out.println("Zrychleni musi byt kladne.");
            System.out.println("Zadane zrychleni: " + increase + " km/h.");
            System.out.println("Aktualni rychlost zustava: "
                    + this.currentSpeed + " km/h.");
        } else if (this.currentSpeed + increase > this.maxSpeed) {
            int pozadovanaRychlost = this.currentSpeed + increase;
            int prekroceni = pozadovanaRychlost - this.maxSpeed;

            System.out.println("Auto nemuze zrychlit.");
            System.out.println("Aktualni rychlost: " + this.currentSpeed + " km/h.");
            System.out.println("Pozadovane zrychleni: +" + increase + " km/h.");
            System.out.println("Pozadovana rychlost: " + pozadovanaRychlost + " km/h.");
            System.out.println("Maximalni rychlost: " + this.maxSpeed + " km/h.");
            System.out.println("Maximalni rychlost by byla prekrocena o " + prekroceni + " km/h.");
        } else if (this.fuelAmount < 0.5) {
            System.out.println("Auto nemuze zrychlit kvuli nedostatku paliva.");
            System.out.println("Aktualni palivo: " + this.fuelAmount + " litru.");
            System.out.println("Pro zrychleni je potreba 0.5 litru.");
            System.out.println("Aktualni rychlost zustava: " + this.currentSpeed + " km/h.");
        } else {
            int puvodniRychlost = this.currentSpeed;
            double puvodniPalivo = this.fuelAmount;

            this.currentSpeed += increase;
            this.fuelAmount -= 0.5;

            System.out.println("Auto uspesne zrychlilo.");
            System.out.println("Zrychleni: +" + increase + " km/h.");
            System.out.println("Puvodni rychlost: " + puvodniRychlost + " km/h.");
            System.out.println("Aktualni rychlost: " + this.currentSpeed + " km/h.");
            System.out.println("Spotrebovane palivo: 0.5 litru.");
            System.out.println("Puvodni palivo: " + puvodniPalivo + " litru.");
            System.out.println("Aktualni palivo: " + this.fuelAmount + " litru.");
        }
    }

    /* Zastaveni */

    public void zastavit() {
        int puvodniRychlost = this.currentSpeed;
        this.currentSpeed = 0;

        System.out.println("Auto zastavilo.");
        System.out.println("Puvodni rychlost: " + puvodniRychlost + " km/h.");
        System.out.println("Zmena rychlosti: -" + puvodniRychlost + " km/h.");
        System.out.println("Aktualni rychlost: " + this.currentSpeed + " km/h.");
        System.out.println("Palivo zustava: " + this.fuelAmount + " litru.");
    }

    public static void main(String[] args) {

        Car2 auto1 = new Car2("Toyota", 180);
        Car2 auto2 = new Car2("Audi", 250, 30);

        System.out.println("---------------------------------------------------------");
        System.out.println("Auto 1: " + auto1.getBrand() + " "
                + auto1.getCurrentSpeed() + " km/h "
                + auto1.getMaxSpeed() + " km/h "
                + auto1.getFuelAmount() + " litru");

        System.out.println("Auto 2: " + auto2.getBrand() + " "
                + auto2.getCurrentSpeed() + " km/h "
                + auto2.getMaxSpeed() + " km/h "
                + auto2.getFuelAmount() + " litru");

        System.out.println("---------------------------------------------------------");



        System.out.println();
        System.out.println("===========Auto 1:===========");

        System.out.println();
        System.out.println("------Zrychlení o 10km/h: ------");
        auto1.currentSpeedPoZrychleniO10();
        
        System.out.println();
        System.out.println("------Zrychlení o hodnotu: ------");
        auto1.setCurrentSpeedZrychleni2(50);

        System.out.println();
        System.out.println("------Nastavení paliva: ------");
        auto1.setFuelAmount(12.23);

        System.out.println();
        System.out.println("------Zastavení: ------");
        auto1.zastavit();
        System.out.println();



        System.out.println();
        System.out.println("===========Auto 2:===========");

        System.out.println();
        System.out.println("------Zrychlení o 10km/h: ------");
        auto2.currentSpeedPoZrychleniO10();

        System.out.println();
        System.out.println("------Zrychlení o hodnotu: ------");
        auto2.setCurrentSpeedZrychleni2(25);

        System.out.println();
        System.out.println("------Nastavení paliva: ------");
        auto2.setFuelAmount(25.5);

        System.out.println();
        System.out.println("------Zastavení: ------");
        auto2.zastavit();
        System.out.println();



        System.out.println("---------------------------------------------------------");

        // Sem muzes pridat dalsi testy metod.
    }
}


