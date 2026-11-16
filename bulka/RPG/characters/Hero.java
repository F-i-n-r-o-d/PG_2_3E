package bulka.RPG.characters;

import bulka.RPG.configs.GameConfig;

public class Hero {

    private static int totalHeroesCreated = 0;

    private String name;
    private Ancestry ancestry;
    private HeroClass heroClass;
    private int health;
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int charisma;
    
    private int level = 1;
    private int xp = 0;
    private int abilityPoints = 0;

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma) {
        if (name == null || name.trim().isEmpty() || name.length() < 3) {
            System.out.println("Byl špatně zadaný parametr jména.");
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        this.ancestry = ancestry;
        this.heroClass = heroClass;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.charisma = charisma;

        totalHeroesCreated++;
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
        this(name, ancestry, heroClass, 100, 10, 5, 5, 5); 
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth) {
        this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5);
    }
    
    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth, int strength) {
        this(name, ancestry, heroClass, maxHealth, strength, 5, 5, 5);
    }

    public static int getTotalHeroesCreated() {
        return totalHeroesCreated;
    }

    public String getName() { return name; }
    public Ancestry getAncestry() { return ancestry; }
    public HeroClass getHeroClass() { return heroClass; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }
    public int getCharisma() { return charisma; }
    public int getLevel() { return level; }
    public int getXp() { return xp; }
    public int getAbilityPoints() { return abilityPoints; }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }

    private int getRequiredXp(int targetLevel) {
        return (int) (Math.pow(targetLevel, 2) * 50 + Math.pow(2, targetLevel));
    }

    public void gainExperience(int xp) {
        if (xp <= 0) {
            return;
        }
        
        this.xp += xp;

        while (this.level < GameConfig.MAX_LEVEL && this.xp >= getRequiredXp(this.level + 1)) {
            this.level++;
            this.abilityPoints += 3;
            this.health = this.maxHealth;
        }
    }

    public boolean allocateStat(HeroStats statName, int points) {
        if (points <= 0 || this.abilityPoints < points || statName == null) {
            return false;
        }

        switch (statName) {
            case STRENGTH: this.strength += points; break;
            case AGILITY: this.agility += points; break;
            case INTELLIGENCE: this.intelligence += points; break;
            case CHARISMA: this.charisma += points; break;
            default: return false;
        }

        this.abilityPoints -= points;
        return true;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}