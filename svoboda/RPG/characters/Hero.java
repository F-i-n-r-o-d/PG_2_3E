package svoboda.RPG.characters;

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
    private int gainExperience;

    public Hero(String name, Ancestry ancestry, HeroClass heroClass,int maxHealth, int strength,
         int agility, int intelligence, int charisma){
            if (name == null || name.isEmpty() || name.length() < 3) {
                throw new IllegalArgumentException("Name must be at least 3 characters long.");
            }
            this.name=name;
            this.ancestry=ancestry;
            this.heroClass=heroClass;
            this.health=maxHealth;
            this.maxHealth=maxHealth;
            this.strength=strength;
            this.agility=agility;
            this.intelligence=intelligence;
            this.charisma=charisma;
    }
    public Hero(String name, Ancestry ancestry, HeroClass heroClass){
        this(name,ancestry,heroClass,100,10,5,5,5);
    }
    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth){
        this(name,ancestry,heroClass,maxHealth,10,5,5,5);
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
    public int getAbilityPoints() {
        return abilityPoints;
    }
    public int getGainExperience() {
        return gainExperience;
    }

    
    public void gainExperience(int xp) {
        if (xp >= 0) {
            this.xp += xp;
        } 
        int nextXpLevel = Math.powExact(level + 1, 2)*50 + Math.powExact(2, level + 1);

        while (this.xp >= nextXpLevel) {
            this.level += 1;
            this.health = this.maxHealth;
            this.abilityPoints += 3;
            nextXpLevel = Math.powExact(level + 1, 2)*50 + Math.powExact(2, level + 1);
        }
    } 
    

    public void allocateStat(HeroStats statName, int points) {
        if (points <= 0 || points > abilityPoints) {
            throw new IllegalArgumentException("Points must be greater than 0.");
        }

        switch (statName) {
            case Strength -> this.strength += points;
            case Agility -> this.agility += points;
            case Intelligence -> this.intelligence += points;
            default -> throw new IllegalArgumentException("Invalid stat name.");
        }

        this.abilityPoints -= points;
    }


    public void takeDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Damage must be greater than 0.");
        } else {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0;
            }
        }
    }


    public boolean isAlive() {
        return this.health > 0;
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
