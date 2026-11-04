package pasler.RPG;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR         
        );
        System.out.println("Welcome to the RPG Game!");
        System.out.println("Name: " + hero.getName());
        System.out.println("Ancestry: " + hero.getAncestry());
        System.out.println("Class: " + hero.getHeroClass());
        System.out.println("Health: " + hero.getHealth() + "/" + hero.getMaxHealth());
        System.out.println("Strength: " + hero.getStrength());
        System.out.println("Agility: " + hero.getAgility());
        System.out.println("Intelligence: " + hero.getIntelligence());
        System.out.println("Charisma: " + hero.getCharisma());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("XP: " + hero.getXp());
    }
}
