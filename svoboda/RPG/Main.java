package svoboda.RPG;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Anccestry.HUMAN, Heroclass.WARRIOR);
        System.out.println("Welcome to the RPG game!");
        System.out.println("Name"+hero.getName());
        System.out.println("Anccestry"+hero.getAnccestry());
        System.out.println("Class"+hero.getHeroclass());
        System.out.println("Health"+hero.getHealth());
        System.out.println("Strength"+hero.getStrength());
        System.out.println("Agility"+hero.getAgility());
        System.out.println("Intelligence"+hero.getIntelligence());
        System.out.println("Charisma"+hero.getCharisma());
        System.out.println("Level"+hero.getLevel());
        System.out.println("XP"+hero.getXp())
    }
    
}