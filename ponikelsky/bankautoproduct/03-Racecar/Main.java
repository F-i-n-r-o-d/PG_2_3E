public class Main {
    
    public static void main (String[] args){
        Racecar auto1 = new Racecar("Audi",170);
        Racecar auto2 = new Racecar("Lamborghini",270,10.25);

        System.out.println(auto1.getBrand());
        System.out.println(auto1.getFuel());
        System.out.println(auto1.getSpeed());
        System.out.println(auto1.getMaxSpeed());
        System.out.println("-------------------------------------");
        auto1.changeFuel(2);
        System.out.println(auto1.getFuel());
        System.out.println("-------------------------------------");
        System.out.println(auto2.getSpeed());
        auto2.setSpeed(250);
        auto2.accelerate();
        System.out.println("-------------------------------------");
        auto2.stop();
        auto2.changeFuel(2.75);
        System.out.println("-------------------------------------");
        auto2.setSpeed(269);
        auto2.accelerate();
        System.out.println(auto2.getFuel());
        


    }
}
