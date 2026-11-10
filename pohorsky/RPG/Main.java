package pohorsky.RPG;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Aragorn",Ancestry.HUMAN, HeroClass.WARRIOR);

        System.out.println("Welcome to the RPG game");
        System.out.println(h1.getagility());
        System.out.println(h1.getcharisma());
        System.out.println(h1.gethealth());
        System.out.println(h1.getintelligence());
        System.out.println(h1.getlevel());
        System.out.println(h1.getmaxHealth());
        System.out.println(h1.getname());
        System.out.println(h1.getstrength());
        System.out.println(h1.getxp());
        System.out.println(h1.getClass());
        System.out.println(h1.getheroClass());
        System.out.println(h1.getAncestry());
        System.out.println(h1.getClass());
    }
}
