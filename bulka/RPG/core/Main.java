package bulka.RPG.core;

import bulka.RPG.characters.Ancestry;
import bulka.RPG.characters.Hero;
import bulka.RPG.characters.HeroClass;
import bulka.RPG.characters.HeroStats;
import bulka.RPG.configs.GameConfig;

public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("A", Ancestry.Human, HeroClass.Warrior, 120, 15, 8, 4, 6);
        System.out.println("Jméno hero1: " + hero1.getName());

        Hero hero2 = new Hero("Legolas", Ancestry.Elf, HeroClass.Rogue);
        System.out.println("Jméno hero2: " + hero2.getName());
        System.out.println("Výchozí zdraví hero2: " + hero2.getHealth());

        System.out.println("\n==== XP a Level Up ====");
        
        System.out.println("Počáteční Level (hero2): " + hero2.getLevel());
        System.out.println("Počáteční Ability Points (hero2): " + hero2.getAbilityPoints());

        hero2.gainExperience(500); 
        System.out.println("Level po získání 500 XP: " + hero2.getLevel());
        System.out.println("Ability Points po Level Up: " + hero2.getAbilityPoints());

        System.out.println("\n==== Rozdělování bodů a Boj ====");
        
        System.out.println("Počáteční Síla (hero2): " + hero2.getStrength());
        boolean success = hero2.allocateStat(HeroStats.STRENGTH, 4);
        System.out.println("Úspěšně rozděleno 4 body do Síly? " + success);
        System.out.println("Nová Síla (hero2): " + hero2.getStrength());
        System.out.println("Zbývající Ability Points (hero2): " + hero2.getAbilityPoints());

        System.out.println("Aktuální HP před útokem: " + hero2.getHealth());
        hero2.takeDamage(50);
        System.out.println("Aktuální HP po poškození 50: " + hero2.getHealth());
        System.out.println("Je naživu? " + hero2.isAlive());

        System.out.println("\n==== Globální počítadlo ====");
        System.out.println("Celkový počet vytvořených hrdinů: " + Hero.getTotalHeroesCreated());
    }
}