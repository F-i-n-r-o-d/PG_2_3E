package RPG;

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

    public int getName() {
        return name;
    }

    public int getAncestry() {
        return ancestry;
    }
    public int getHeroClass() {
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
    
}
