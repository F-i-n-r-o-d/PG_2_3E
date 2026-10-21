public class Car {
    private String brand;
    private double actualSpeed;
    private double maxSpeed;
    private double fuel;

    public Car(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.actualSpeed = 0.0;
        this.fuel = 20.0;
    }

    public Car(String brand, double maxSpeed, double startingFuel) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.actualSpeed = 0.0;
        this.fuel = startingFuel > 0 ? startingFuel : 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public double getActualSpeed() {
        return actualSpeed;
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

    public boolean speedUp() {
        double usage = 0.5;
        double increment = 10.0;

        if (fuel >= usage) {
            fuel -= usage;
            actualSpeed += increment;
            if (actualSpeed > maxSpeed) {
                actualSpeed = maxSpeed;
            }
            System.out.println("Auto " + brand + " zrychluje o " + increment + " km/h. Aktuální rychlost: " + actualSpeed + " km/h. Zbývající palivo: " + fuel);
            return true;
        }
        System.out.println("Nelze zrychlit, protože nedostatek paliva.");
        return false;
    }

    public boolean speedUp(double speedIncrement, double fuelUsage) {
        if (speedIncrement > 0 && fuelUsage >= 0 && fuel >= fuelUsage) {
            fuel -= fuelUsage;
            actualSpeed += speedIncrement;
            if (actualSpeed > maxSpeed) {
                actualSpeed = maxSpeed;
            }
            System.out.println("Auto " + brand + " zrychluje o " + speedIncrement + " km/h. Aktuální rychlost: " + actualSpeed + " km/h. Zbývající palivo: " + fuel);
            return true;
        }
        System.out.println("Nelze zrychlit, protože nedostatek paliva.");
        return false;
    }

    public void stop() {
        actualSpeed = 0.0;
    }
}
