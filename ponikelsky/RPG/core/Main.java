package ponikelsky.RPG.core;

import ponikelsky.RPG.characters.Ancestry;
import ponikelsky.RPG.characters.Hero;
import ponikelsky.RPG.characters.HeroClass;
import ponikelsky.RPG.configs.GameConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the RPG Game!");
        System.out.println("Heroes Created: " + Hero.getTotalHeroesCreated());
        System.out.println("");
       Hero hero1 = new Hero("Aragorn", Ancestry.HUMAN ,HeroClass.WARRIOR); 
       //Hero hero2 = new Hero("name", Ancestry.DWARF, HeroClass.CLERIC, 0, 0, 0, 0, 0)
       //Hero hero3 = new Hero();
    
    
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
    System.out.println("Heroes Created: " + Hero.getTotalHeroesCreated());

    System.out.println("Ability points: " + hero1.getAbilityPoints());
    hero1.gainExperience(1000);
    System.out.println("Ability points: " + hero1.getAbilityPoints());
    }
}
