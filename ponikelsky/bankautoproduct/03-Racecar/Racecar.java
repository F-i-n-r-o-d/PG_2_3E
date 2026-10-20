public class Racecar {
    //atributy
    private String brand;
    private int actualSpeed;
    private final int MAXSPEED;
    private double fuel;

    //konstruktory
    public Racecar(String brand, int MAXSPEED){
        this.brand = brand;
        this.MAXSPEED = MAXSPEED;
        this.actualSpeed = 0;
        this.fuel = 20.0;
    }

    public Racecar(String brand, int MAXSPEED, double fuel){
        this.brand = brand;
        this.MAXSPEED = MAXSPEED;
        this.actualSpeed = 0;
        this.fuel = fuel;
    }
    //gettery
    public String getBrand(){
        return this.brand;
    }

    public int getSpeed(){
        return this.actualSpeed;
    }

    public double getFuel(){
        return this.fuel;
    }
    
    public int getMaxSpeed(){
        return this.MAXSPEED;
    }
    //setter
    public void changeFuel(double fuel){
        if( fuel < 0){
            System.out.println("Nelze zadat záporná hodnota");
        } else {
            this.fuel=fuel;
            System.out.println("Hodnota paliva úspěšně změněna");
        }
    }
    //metody
    public void accelerate(){
        if(fuel<0.5){
            System.out.println("Nedostatek paliva");
        } else  if (this.actualSpeed + 10 > MAXSPEED && MAXSPEED!=actualSpeed){
            actualSpeed=MAXSPEED;
            System.out.println("Auto dosáhlo maximální rychlosti");
        } else  if(MAXSPEED==actualSpeed){
            System.out.println("Auto už nemůže zrychlit");
        } else {
            this.actualSpeed += 10;
            System.out.println("Auto zrychlilo na " + actualSpeed + " km/h");
        }
    }

    public void setSpeed(int speed){
        if(speed < 0){
            System.out.println("Neplatná rychlost");
        } else if(speed>MAXSPEED){
            System.out.println("Auto už nemůže zrychlit");
        } else if(speed > actualSpeed){
        double fuelNeeded = (speed - actualSpeed) * 0.01;

        if(fuelNeeded > fuel){
            System.out.println("Nedostatek paliva");
        } else {
            fuel -= fuelNeeded;
            actualSpeed = speed;
            System.out.println("Auto zrychlilo na " + speed + " km/h");
            System.out.println("Spotřebované palivo: " + fuelNeeded);
        }
    } else if(speed < actualSpeed){
        int difference = actualSpeed - speed;
        actualSpeed = speed;
        System.out.println("Auto zpomalilo o " + difference + " km/h");
    } else {
        System.out.println("Auto už jede požadovanou rychlostí");
    }

            
    }

    public void stop(){
        actualSpeed = 0;
        System.out.println("Vozidlo zastavilo");
    }
}
