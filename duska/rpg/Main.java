
//package duska.rpg.core;
//import duska.rpg.characters.Hero;





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
        System.out.println("XP"+hero.getXp());
        

        Hero hero2 = new Hero("LEGOLAS", Anccestry.ELF, Heroclass.RANGER, 120, 4, 3, 8, 9);

        System.out.println("Name"+hero2.getName());
        System.out.println("Anccestry"+hero2.getAnccestry());
        System.out.println("Class"+hero2.getHeroclass());
        System.out.println("Health"+hero2.getHealth());
        System.out.println("Strength"+hero2.getStrength());
        System.out.println("Agility"+hero2.getAgility());
        System.out.println("Intelligence"+hero2.getIntelligence());
        System.out.println("Charisma"+hero2.getCharisma());
        System.out.println("Level"+hero2.getLevel());
        System.out.println("XP"+hero2.getXp());

} 

}