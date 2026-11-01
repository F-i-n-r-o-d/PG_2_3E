package pasler.RPG.characters;

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
    private int abilityPoints = 0;
    private int level = 1;
    private int xp = 0;

    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma) {
        if (name == null || name.isEmpty() || name.length() < 3) {
            System.out.println("Name cannot be null or empty neither shorter than 3 characters.");
            throw new IllegalArgumentException("Name cannot be null or empty neither shorter than 3 characters.");
        } else {
            this.name = name;
        }
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

    public int getAbilityPoints() {
        return abilityPoints;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void gainExperience(int xp) {
        if(xp > 0) {
            this.xp += xp;
        }

        int nextLvlXps = Math.powExact(this.level + 1, 2) * 50 + Math.powExact(2, this.level + 1);
        while(xp >= nextLvlXps){
            this.level++;
            this.abilityPoints += 3;
            nextLvlXps = Math.powExact(this.level + 1, 2) * 50 + Math.powExact(2, this.level + 1);
        }
    }

    public void allocateStat(HeroStats heroStat, int points) {
        if(this.abilityPoints < points){
            return;
        }
        switch (heroStat) {
            case STRENGTH:
                this.strength += points;
                break;
            case AGILITY:
                this.agility += points;
                break;
            case INTELLIGENCE:
                this.intelligence  += points;
            case CHARISMA:
                this.charisma += points;
                break;
            default:
                break;
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
