package straka.RPG.characters;

import straka.RPG.configs.GameConfig;
import straka.RPG.configs.GameUtils;

public class Hero {
    private String name;
    private Ancestry ancestry;
    private HeroClass heroClass;
    private int health;
    private int strenght;
    private int agility;
    private int maxHealth;
    private int inteligence;
    private int charisma;
    private int level = 1;
    private int xp = 0;
    private int abilityPoints = 0;
    private static int totalHeroesCreated = 0;

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma) {
    if(name.length() < 3) {
        System.out.println("Špatné jméno");
    }
    this.name = name;
    this.ancestry = ancestry;
    this.heroClass = heroClass;
    this.health = maxHealth;
    this.maxHealth = maxHealth;
    this.strenght = strength;
    this.agility = agility;
    this.inteligence = intelligence;
    this.charisma = charisma;
    
    totalHeroesCreated++;

}

    public Hero(String name, Ancestry ancestry, HeroClass  heroClass) {
        this(name, ancestry, heroClass, 100, 10, 5, 5, 5);
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth) {
        this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5);
    }

    public Hero(String name, String note) {
        this.name = name;
        System.out.println(note);
    }

    public String getName() {
        return name;
    }

    public Ancestry getAncestry() {
        return ancestry;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public int getHealth() {
        return health;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getAgility() {
        return agility;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getInteligence() {
        return inteligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getAbilityPoints() {
        return abilityPoints;
    }

    public void getGainExperience(int xp) {
        if(xp >= 0) {
            this.xp += 0;
        }

        while(this.xp >= GameUtils.getXpForLevel(this.level + 1)) {
            if(this.level >= GameConfig.MAX_LEVEL) {
                return;
            }
            this.health = maxHealth;
            level++;
            abilityPoints += 3;
        }
    }
    public void getHealth(int health) {
        if(health < 0) {
            this.health = 0;
        } else if(health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }

    public boolean allocateStat(HeroStats statName, int points) {
        if (points <= 0 || points > abilityPoints) {
            return false;
    }
    switch (statName) {
        case STRENGTH:
            strenght += points;
            break;
        case AGILITY:
            agility += points;
            break;
        case INTELLIGENCE:
            inteligence += points;
            break;
        default:
            return false;
    }
        abilityPoints -= points;
        return true;
    }

    public void takeDamage(int damage) {
        if (damage <= 0) {
            return;
        }
        health = Math.max(0, health - damage);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public static int getTotalHeroesCreated() {
        return totalHeroesCreated;
    }


}
