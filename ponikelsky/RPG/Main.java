package ponikelsky.RPG;

public class Main {
    public static void main(String[] args) {
       Hero hero1 = new Hero("Aragorn", Ancestry.HUMAN,HeroClass.WARRIOR); 
    
    System.out.println("Welcome to the RPG Game!");
    System.out.println("Name: " + hero1.getName());
    System.out.println("Ancestry: " + hero1.getAncestry());
    System.out.println("Class: " + hero1.getHeroClass());
    System.out.println("Health: " + hero1.getHealth()+ "/" + hero1.getMaxHealth());
    System.out.println("Strength: " + hero1.getStrength());
    System.out.println("Agility: " + hero1.getAgility());
    System.out.println("Intelligence: " + hero1.getIntelligence());
    System.out.println("Charisma: " + hero1.getCharisma());
    System.out.println("Level: " + hero1.getLevel());
    System.out.println("Xp: " + hero1.getXp());
    }
}
