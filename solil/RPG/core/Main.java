package solil.RPG.core;
import solil.RPG.Hero.Hero;
import solil.RPG.characters.Ancestry;
import solil.RPG.characters.HeroClass;
import solil.RPG.configs.GameConfig;
public class Main {
    public static void main(String[] args) {
       Hero hero1 = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR); 
       Hero hero2 = new Hero("Aragon", Ancestry.HUMAN, HeroClass.WARRIOR, 100, 10, 5, 5, 5);

    System.out.println(hero1.getName());
    System.out.println(hero1.getAncestry());
    System.out.println(hero1.getHeroClass());
    System.out.println(hero1.getHealth());
    System.out.println(hero1.getMaxHealth());
    System.out.println(hero1.getStrength());
    System.out.println(hero1.getAgility());
    System.out.println(hero1.getName());
    System.out.println(hero1.getName());
    System.out.println(hero1.getName());
}
}