public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 180, 50);
        Car car2 = new Car("Honda", 200, 60);

        System.out.println("-----------------");
        System.out.println("Auto značky: " + car1.getBrand() + ", Maximální rychlost: " + car1.getMaxSpeed() + " km/h, Aktuální rychlost: " + car1.getActualSpeed() + " km/h, Palivo: " + car1.getFuel() + " l");
        System.out.println("Auto značky: " + car2.getBrand() + ", Maximální rychlost: " + car2.getMaxSpeed() + " km/h, Aktuální rychlost: " + car2.getActualSpeed() + " km/h, Palivo: " + car2.getFuel() + " l");
        System.out.println("-----------------");

        car1.speedUp(30, 0);
        car2.speedUp(50, 0);

        System.out.println("-----------------");
        System.out.println(car1.getActualSpeed());
        System.out.println(car2.getActualSpeed());
        System.out.println("-----------------");

        car1.setFuel(20);
        car2.setFuel(30);

        System.out.println("-----------------");
        System.out.println(car1.getFuel());
        System.out.println(car2.getFuel());
        System.out.println("-----------------");

        car1.stop();

        System.out.println("-----------------");
        System.out.println(car1.getActualSpeed());
        System.out.println("-----------------");
    }
}
