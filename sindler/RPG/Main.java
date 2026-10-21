package sindler.RPG;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Aragorn", HeroClass.MAGE, Ancestry.HUMAN);
        h1.setHealth(100);
        System.out.println("Hero's health: " + h1.getHealth());
        System.out.println("Hero's name: " + h1.getName());
        System.out.println("Hero's class: " + h1.getHeroClass());
        System.out.println("Hero's ancestry: " + h1.getAncestry());
        System.out.println("Hero's level: " + h1.getLevel());
        System.out.println("Hero's mana: " + h1.getMana());
        System.out.println("Hero's strength: " + h1.getStrength());
        System.out.println("Hero's XP: " + h1.getXp());
        System.out.println("Hero's charisma: " + h1.getCharisma());
        System.out.println("Hero's intelligence: " + h1.getIntelligence());
    }
}
