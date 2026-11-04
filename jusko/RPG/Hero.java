package jusko.RPG;

public class Hero {
    private String name;
    private Ancestry ancestry;
    private HeroClass heroClass;
    private int Health;
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int charisma;
    private int level = 1;
    private int xp = 0;

    public Hero(String name, Ancestry ancestry, HeroClass heroClass){
        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
    }

    public String getname(){
        return name;
    }
    public Ancestry getAncestry(){
        return ancestry;
    }
    public HeroClass getHeroClass(){
        return heroClass;
    }
    public int getHealth(){
        return Health;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getStreaht(){
        return strength;
    }
    public int getagility(){
        return agility;
    }
    public int getintelligence(){
        return intelligence;
    }
    public int getcharisma(){
        return charisma;
    }
    public int getLevel(){
        return level;
    }
    public int getxp(){
        return xp;
    }

    public void setHealth(int health){
        if (health < 0){
            this.Health = 0;
        }
        else if ( health > maxHealth){
            this.Health = maxHealth;
        }
        else{
            this.Health = health;
        }
    }
}
