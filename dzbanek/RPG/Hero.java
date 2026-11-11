package dzbanek.RPG.core;

import configs.GameConfig;

public class Hero {

    private String name;
    private Ancestry ancestry;
    private int health;
    private int maxHealth;
    private HeroClass heroClass;
    private int level = 1;
    private int Xp = 0;
    private int strength;
    private int intelligence;
    private int agility;
    private int charisma;
    private int abilityPoints = 0;
    private static int totalHeroesCreated = 0;

    private Hero(String name, Ancestry ancestry,
            HeroClass heroClass, int maxHealth, int strength,
            int agility, int intelligence, int charisma) {

        if (name.length() < 3) {
            System.out.print("Špatné jméno");
        }

        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
        this(name, ancestry, heroClass, 100, 10, 5, 5, 5);
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth) {
        this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5);
    }

    public Hero(String name, String note) {
        this.name = name;
        System.out.print(note);
    }

    public String getName() {
        return name;
    }

    public Ancestry getAncestry() {
        return ancestry;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return Xp;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }

    
    public void gainExperience(int xp) {

        if (xp >= 0) {
            Xp += xp;
        }
        if (this.level >= GameConfig.MAX_LEVEL) {
            this.level = GameConfig.MAX_LEVEL;
        }
        int nextLvlXp = (int)(Math.pow(level + 1, 2) * 50
                + Math.pow(2, level + 1));

        while (Xp >= nextLvlXp) {
            level++;
            health = maxHealth;
            abilityPoints += 3;

            nextLvlXp = (int)(Math.pow(level + 1, 2) * 50
                    + Math.pow(2, level + 1));
        }
    }

    
    public void allocateStat(HeroStats statName, int points) {

        if (points <= 0 || points > abilityPoints) {
            return;
        }

        switch (statName) {
            case STRENGTH:
                strength += points;
                break;

            case AGILITY:
                agility += points;
                break;

            case INTELLIGENCE:
                intelligence += points;
                break;
        }

        abilityPoints -= points;
    }

    
    public void takeDamage(int damage) {
        this.health = 0;
    }

    
    public boolean isAlive() {
        return health > 0;
    }
    public static int getTotalHeroesCreated(){
        return totalHeroesCreated;
    }
}