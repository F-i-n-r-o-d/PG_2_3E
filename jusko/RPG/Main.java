package jusko.RPG;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("david", Ancestry.HUMAN, HeroClass.MAGE);

        System.out.println(h1.getname());
        System.out.println(h1.getAncestry());
        System.out.println(h1.getHeroClass());
        System.out.println(h1.getHealth());
        System.out.println(h1.getMaxHealth());
        System.out.println(h1.getStreaht());
        System.out.println(h1.getagility());
        System.out.println(h1.getintelligence());
        System.out.println(h1.getcharisma());
        System.out.println(h1.getLevel());
        System.out.println(h1.getxp());
    }
}
