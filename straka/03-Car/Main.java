public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Ferrari", 300);

        Car c2 = new Car("Mazda", 200, 1);

        System.out.println(c1.getBrand() + ": rychlost " + c1.getSpeed() + ", palivo " + c1.getFuel());
        System.out.println(c2.getBrand() + ": rychlost " + c2.getSpeed() + ", palivo " + c2.getFuel());

        c1.accelerate();
        System.out.println("Po zrychlení: " + c1.getSpeed() + " km/h, palivo " + c1.getFuel());

        c1.accelerate(50);
        System.out.println("Po zrychlení o 50: " + c1.getSpeed() + " km/h, palivo " + c1.getFuel());

        c1.accelerate(1000);
        System.out.println("Po zrychlení o 1000: " + c1.getSpeed() + " km/h (max " + c1.getMaxSpeed() + ")");

        c1.stop();
        System.out.println("Po zastavení: " + c1.getSpeed() + " km/h");

        c2.accelerate();
        c2.accelerate();
        System.out.println("Mazda po dvou zrychleních: " + c2.getSpeed() + " km/h, palivo " + c2.getFuel());
        c2.accelerate();
        System.out.println("Mazda po třetím pokusu: " + c2.getSpeed() + " km/h (nezrychlila)");

        c2.setFuel(-5);
        System.out.println("Palivo po setFuel(-5): " + c2.getFuel());
        c2.setFuel(10);
        System.out.println("Palivo po setFuel(10): " + c2.getFuel());
    }
}