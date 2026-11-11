

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Anccestry.HUMAN, Heroclass.WARRIOR);
        System.out.println("Welcome to the RPG game!");
        System.out.println("Name"+hero.getname());
        System.out.println("Anccestry"+hero.getanccestry());
        System.out.println("Class"+hero.getheroclass());
        System.out.println("Health"+hero.gethealth());
        System.out.println("Strength"+hero.getstrength());
        System.out.println("Agility"+hero.getagility());
        System.out.println("Intelligence"+hero.getintelligence());
        System.out.println("Charisma"+hero.getcharisma());
        System.out.println("Level"+hero.getlevel());
        System.out.println("XP"+hero.getxp());
        

        Hero hero2 = new Hero("LEGOLAS", Anccestry.ELF, Heroclass.RANGER, 120, 4, 3, 8, 9);

        System.out.println("Name"+hero2.getname());
        System.out.println("Anccestry"+hero2.getanccestry());
        System.out.println("Class"+hero2.getheroclass());
        System.out.println("Health"+hero2.gethealth());
        System.out.println("Strength"+hero2.getstrength());
        System.out.println("Agility"+hero2.getagility());
        System.out.println("Intelligence"+hero2.getintelligence());
        System.out.println("Charisma"+hero2.getcharisma());
        System.out.println("Level"+hero2.getlevel());
        System.out.println("XP"+hero2.getxp());

} 

}