public class Main {
    public static void main(String[] args) {
        Automobil a1 = new Automobil(1234, 200);
        Automobil a2 = new Automobil(5678, 150, 100);

        info(a1);
        info(a2);

        a1.increaseSpeed();

        System.out.println("-------------------------------");
        System.out.println("Po zvýšení rychlosti pro " + a1.getSign() + " je nová rychlost: " + a1.getCurrentSpeed() + " km/h, a litrů v nádrži: " + a1.getFuel() + " l");
        System.out.println("Po nastavení rychlosti " + a2.setSpeed(100) + " km/h pro " + a2.getSign() + " je nová rychlost: " + a2.getCurrentSpeed() + " km/h, a litrů v nádrži: " + a2.getFuel() + " l");

        System.out.println("-------------------------------");
        System.out.println("Po přidání " + a1.addFuel(10) + " litrů paliva do " + a1.getSign() + " je litrů v nádrži: " + a1.getFuel() + " l");
        System.out.println("Po přidání " + a2.addFuel(-20) + " litrů paliva do " + a2.getSign() + " je litrů v nádrži: " + a2.getFuel() + " l");

        a1.stop();
        System.out.println("-------------------------------");
        System.out.println("Po zastavení je nová rychlost " + a1.getSign()+": " + a1.getCurrentSpeed() + " km/h");
    }

    private static void info(Automobil a) {
        System.out.println("------------------------------");
        System.out.println("Automobil: " + a.getSign());
        System.out.println("Maximální rychlost: " + a.getMaxSpeed() + " km/h");
        System.out.println("Aktuální rychlost: " + a.getCurrentSpeed() + " km/h");
        System.out.println("Palivo: " + a.getFuel() + " l");
    }
}
