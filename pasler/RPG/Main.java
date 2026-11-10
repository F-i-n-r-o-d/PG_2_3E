package pasler.RPG;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragorn", Ancestry.HUMAN, HeroClass.WARRIOR         
        );
        System.out.println(hero.getAbilityPoints());
        hero.gainExperience(1000);
        System.out.println(hero.getAbilityPoints());
    }
}
