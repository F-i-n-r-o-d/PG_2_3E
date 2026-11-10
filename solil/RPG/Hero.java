package solil.RPG;
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
    private int gainedXp = 0;
    private int abilityPoints = 0;
    private int toNxtLvl = (Math.pow(level, 2) * 50 + Math.pow(2, level));
    private enum HeroStats {
        strength,
        agility,
        intelligence
    }

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {
        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
    }
public Hero(String name, Ancestry ancestry,
HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int
charisma) {
        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
        this.health = maxHealth;
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
    public void setName(string name){
        if(name == null || name.isEmpty() || name.length() < 3){
            throw new IllegalArgumentException("Name must be at least 3 characters long.");
        }
        this.name = name;
    }

    public void gainXp(int xp){
        if (xp =>0){
            this.xp += xp;
        }
        while (xp>toNxtLvl){
            level++;
            abilityPoints += 3;
            this.health = maxHealth;
        }
    }
public class Hero {

    private int strength;
    private int agility;
    private int intelligence;
    private int availablePoints;

    public boolean allocateStat(HeroStats statName, int points) {
        if (points <= 0 || points > abilityPoints) {
            return false;
        }
        switch (statName) {
            case strength:
                strength += abilityPoints;
                break;
            case agility:
                agility += abilityPoints;
                break;
            case intelligence:
                intelligence += abilityPoints;
                break;
            default:
                return false;
        }
        abilityPoints -= points;
        return true;
    }
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
    public void takeDamage(int damage){
        if(damage>0){
            this.health -= damage;
        }
    }
    public void isAlive(){
        if(health <= 0){
            System.out.println(name + " zemřel.");
        } else {
            System.out.println(name + " žije.");
        }
    }
