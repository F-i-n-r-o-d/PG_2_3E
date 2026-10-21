package pohorsky.RPG;

public class Hero {
    private String  name;
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

    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {

        this.name=name;
        this.ancestry=ancestry;
        this.heroClass=heroClass;
    }













    public String getname() {
        return name;
    }

    public Ancestry getAncestry() {
        return ancestry;
    }

    public HeroClass getheroClass() {
        return heroClass;
    }

    public int gethealth() {
        return health;
    }

    public int getmaxHealth() {
        return maxHealth;
    }

    public int getstrength() {
        return strength;
    }

    public int getagility() {
        return agility;
    }

    public int getintelligence() {
        return intelligence;
    }

    public int getcharisma() {
        return charisma;
    }

    public int getlevel() {
        return level;
    }

    public int getxp() {
        return xp;
    }


    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health=maxHealth;
        }else {
            this.health = health;
        }
    }


}












