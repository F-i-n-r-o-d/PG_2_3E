package mashtalyarchuk.RPG;

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

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
        this.name = name;
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

    public int gainExperience(xp){
        if (xp >= 0) {
            this.xp += xp;
        } else {
            return this.xp;
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
}
