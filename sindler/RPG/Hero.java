package sindler.RPG;

public class Hero {
    private String name;
    private HeroClass HeroClass;
    private Ancestry Ancestry;
    private int level = 1;
    private int health;
    private int mana;
    private int strength;
    private int xp = 0;
    private int charisma;
    private int intelligence;
    private int maxHealth;

    public Hero (String Aragorn, HeroClass Mage, Ancestry Human) {
        if (name == null || name.isEmpty() || name.length() < 3) {
            throw new IllegalArgumentException("Name cannot be null or empty neither shorter than 3 characters.");
        } else {
        this.name = name;
        }
        this.HeroClass = HeroClass;
        this.Ancestry = Ancestry;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.charisma = charisma;
        this.intelligence = intelligence;
        
    }

    public String getName() {
        return name;
    }

    public HeroClass getHeroClass() {
        return HeroClass;
    }

    public Ancestry getAncestry() {
        return Ancestry;
    }

    public int getLevel() {
        return level;
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

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getXp() {
        return xp;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
