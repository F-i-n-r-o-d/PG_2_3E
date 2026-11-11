package svoboda.RPG.core;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
        // Hero hero2 = new Hero()
    System.out.println(hero1.getName());
    System.out.println(hero1.getAncestry());
    System.out.println(hero1.getHeroClass());
    System.out.println(hero1.getHealth());
    System.out.println(hero1.getMaxHealth());
    System.out.println(hero1.getStrength());
    System.out.println(hero1.getAgility());
    }
}