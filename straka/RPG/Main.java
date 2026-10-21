package straka.RPG;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR);
        System.out.println("Welcome to the RPG game!");
        System.out.println("Hero's name: " + hero.getName());
        System.out.println("Hero's ancestry: " + hero.getAncestry());
        System.out.println("Hero's class: " + hero.getHeroClass());
        System.out.println("Hero's health: " + hero.getHealth());
        System.out.println("Hero's strength: " + hero.getStrenght());
        System.out.println("Hero's agility: " + hero.getAgility());
        System.out.println("Hero's intelligence: " + hero.getInteligence());
        System.out.println("Hero's charisma: " + hero.getCharisma());
        System.out.println("Hero's level: " + hero.getLevel());
        System.out.println("Hero's XP: " + hero.getXp());
    }
}
