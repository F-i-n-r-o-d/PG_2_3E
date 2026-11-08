package boucek.RPG;

public class Hero {
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

    // daniel specinger vypada jak orangutan

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma) {
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

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int health, int maxHealth, int strength, int agility, int intelligence, int charisma) {
        if (name == null || name.isEmpty() || name.length() < 3) {
            System.out.println("Invalid name.");
        } else {
            this.name = name;
        } 
        
        this.ancestry = ancestry;
        this.heroClass = heroClass;
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.charisma = charisma;
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

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
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

    public void gainExperience(int xp) {
        if (xp >= 0) {
            this.xp += xp;
        }

        int nextLevel = Math.powExact(level + 1, 2) * 50 + Math.powExact(2, level + 1);
        while (this.xp >= nextLevel) {
            this.level++;
            this.abilityPoints += 3;
            this.health = this.maxHealth;
            nextLevel = Math.powExact(level + 1, 2) * 50 + Math.powExact(2, level + 1);
        }
    }

    public enum Stats {
        STRENGTH, AGILITY, INTELLIGENCE, CHARISMA;
    }

    public void allocateStat(int Abilitypoints, int points, Stats stat) {
        if (Abilitypoints - points >= 0 && points > 0) {
            switch (stat) {
                case STRENGTH:
                    this.strength += points;
                    this.abilityPoints -= points;
                    break;
                case AGILITY:
                    this.agility += points;
                    this.abilityPoints -= points;
                    break;
                case INTELLIGENCE:
                    this.intelligence += points;
                    this.abilityPoints -= points;
                    break;
                case CHARISMA:
                    this.charisma += points;
                    this.abilityPoints -= points;
                    break;
                default:
                    System.out.println("Invalid stat.");
            }
        } else {
            System.out.println("Not enough a ability points.");
        }
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
        if (this.health <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
