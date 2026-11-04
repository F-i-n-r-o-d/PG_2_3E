package boucek.RPG;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Aragorn", Ancestry.Ancestries.HUMAN, HeroClass.Heroclass.WARRIOR, 100, 100, 15, 10, 8, 12);

        System.out.println("Hero: " + hero1.getName() + ", Ancestry: " + hero1.getAncestry() + ", Class: " + hero1.getHeroClass() + ", Health: " + hero1.getHealth() + "/" + hero1.getMaxHealth());
    }
}