public class Automobil {
    private int sign;
    private int maxSpeed;
    private double fuel; //Mohlo se dát ještě maximální počet paliva v nádrži.
    private int currentSpeed = 0;

    public Automobil (int sign, int maxSpeed) {
        this(sign, maxSpeed, 20);
    }

    public Automobil (int sign, int maxSpeed, double fuel) {
        this.sign = sign;
        this.maxSpeed = maxSpeed;
        if (fuel > 0) {
            this.fuel = fuel;
        } else {
            this.fuel = 0;
        }
    }

    public int getSign() {
        return this.sign;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getFuel() {
        return this.fuel;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public double addFuel (double fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        }
        return fuel;
    }

    public void brake() {
        if (currentSpeed - 10 > 0) {
            currentSpeed -= 10;
        } else {
            currentSpeed = 0;
        }
    }

    public void increaseSpeed() {
        if ((currentSpeed + 10) < maxSpeed && fuel >= 0.5) {
            currentSpeed += 10;
            fuel -= 0.5;
        } else if (fuel >= 0.5 && maxSpeed != currentSpeed) {
            fuel = (maxSpeed - currentSpeed) * 0.5;
            currentSpeed = maxSpeed;
        }
    }

    public int setSpeed (int setSpeed) {
        if (setSpeed <= maxSpeed && setSpeed > currentSpeed && fuel > (setSpeed - currentSpeed) * 0.5) {
            fuel -= (setSpeed - currentSpeed) * 0.05;
            currentSpeed = setSpeed;
        }
        return setSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}