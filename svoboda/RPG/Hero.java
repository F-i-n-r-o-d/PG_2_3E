package svoboda.RPG;

public class Hero {
        private String name;
        private Ancestry ancestry;
    private Heroclass heroClass;
    private int health; 
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int charisma;
    private int level=1;
    private int xp=0;

    public Hero (String name,Ancestry ancestry,Heroclass heroClass){
        this.name=name;
        this.ancestry=ancestry;
        this.heroClass=heroClass;
    }

    public String getName() {
        return name;
    }
    public Ancestry getAncestry() {
        return ancestry;
    }
    public Heroclass getHeroClass() {
        return heroClass;
    }
    public int getHealth() {
        return health;
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

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > this.maxHealth) {
            this.health = this.maxHealth;
        } else {
            this.health = health;
        }
    }
}   
