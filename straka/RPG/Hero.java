package straka.RPG;

public class Hero {
    private String name;
    private Ancestry ancestry;
    private HeroClass heroClass;
    private int health;
    private int strenght;
    private int agility;
    private int maxHealth;
    private int inteligence;
    private int charisma;
    private int level = 1;
    private int xp = 0;

    public Hero(String name, Ancestry ancestry, HeroClass  heroClass) {
        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
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

    public int getStrenght() {
        return strenght;
    }

    public int getAgility() {
        return agility;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getInteligence() {
        return inteligence;
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

    public void getHealth(int health) {
        if(health < 0) {
            this.health = 0;
        } else if(health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }



}
