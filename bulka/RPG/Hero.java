package bulka.RPG;

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

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
            this(name, ancestry, heroClass, 100, 10, 5, 5, 5)
        }
    
    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth) {
        this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5)
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
        if (name == null || name.isEmpty() || name.length() < 3) {
            throw new IllegalArgumentException("Name cannot be null or empty and must be at least 3 characters long");
        } else {
            this.name = name;
        }
        this.ancestry = ancestry;
        this.heroClass = heroClass;
    }

    //gettery

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
    
    public int abilityPoints() {
        return abilityPoints;
    }





    public void setHeatlh(int health) {
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
            this.xp += xp;
        }
        int nextLvXp = Math.powExact(level+1, 2)*50 + Math.powExact(2, level+1);
    }

}

