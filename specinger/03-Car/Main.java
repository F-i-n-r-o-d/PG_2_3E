public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Škoda", 200);
        Car c2 = new Car("Renault", 220, 15.0);

        System.out.println("Výchozí zrychlení");
        boolean vysledek1 = c1.zrychleni();
        System.out.println("Zrychlení úspěšné? " + (vysledek1 ? "ANO" : "NE"));
        System.out.println("Aktuální rychlost: " + c1.getAktualniRychlost() + " km/h ");

        System.out.println("----------------------------------");
        System.out.println("Nastavitelné zrychlení");
        boolean vysledek2 = c1.zrychleni(50);
        System.out.println("Zrychlení úspěšné? " + (vysledek2 ? "ANO" : "NE"));
        System.out.println("Aktuální rychlost: " + c1.getAktualniRychlost() + " km/h ");

        System.out.println("----------------------------------");
        System.out.println("Zastavevení");
        c1.zastaveni();
        System.out.println("Zastaveno. Aktuální rychlost: " + c1.getAktualniRychlost() + " km/h");
        
    }
    
}