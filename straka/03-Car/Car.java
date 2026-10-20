public class Car {

    private static final double FUEL_PER_ACCELERATION = 0.5;
    private static final double DEFAULT_ACCELERATION = 10;

    private final String brand;
    private double speed;
    private final double maxSpeed;
    private double fuel;

    public Car(String brand, double maxSpeed) {
        this(brand, maxSpeed, 20);
    }

    public Car(String brand, double maxSpeed, double fuel) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.fuel = fuel >= 0 ? fuel : 0;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (fuel >= 0) {
            this.fuel = fuel;
        }
    }

    public void accelerate() {
        accelerate(DEFAULT_ACCELERATION);
    }

    public void accelerate(double amount) {
        if (amount <= 0 || fuel < FUEL_PER_ACCELERATION) {
            return;
        }
        speed += amount;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        fuel -= FUEL_PER_ACCELERATION;
    }

    public void stop() {
        speed = 0;
    }
}