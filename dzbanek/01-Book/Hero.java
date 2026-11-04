package dzbanek.RPG;

public class Hero {
    private String name;
    private Ancestery ancestry;
    private int health;
    private int maxHealth;
    private HeroClass heroClass;
    private int level = 1;
    private int Xp = 0;
    private int strength;
    private int intelligence;
    private int agility;
    private int charisma;
public Hero(String name, Ancestery ancestry, HeroClass heroClass){
    if (name == null || name.isEmpty() || name .length() < 3) {
            throw new IllegalArgumentException("Hero name must be at least 3 characters long or null.");
        } else{this.name = name;}

        this.ancestry = ancestry;
        this.heroClass = heroClass;
}
    public String getName() {
        return name;
    }
    public Ancestery getAncestry() {
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
}

