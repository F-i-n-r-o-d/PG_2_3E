package dzbanek.RPG;

public class Main{
   public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestery.HUMAN, HeroClass.WARRIOR);
        System.out.println("Welcome to the RPG game!");
        System.out.println("Name: " + hero.getName());
        System.out.println("Ancestry: " + hero.getAncestry());
        System.out.println("Health: " + hero.getHealth() + "/" + hero.getMaxHealth());
        System.out.println("Class: " + hero.getHeroClass());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("XP: " + hero.getXp());
        System.out.println("Strength: " + hero.getStrength());
        System.out.println("Intelligence: " + hero.getIntelligence());
        System.out.println("Agility: " + hero.getAgility());
        System.out.println("Charisma: " + hero.getCharisma());
    } 
}