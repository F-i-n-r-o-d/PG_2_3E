package svoboda.RPG;

public class Hero {
        private String Name;
        private Anccestry Anccestry;
    private Heroclass Heroclass;
    private int Health; 
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int charisma;
    private int level=1;
    private int xp=0;

    public int abilityPoints = 0;

    public Hero (String name,Anccestry anccestry,Heroclass heroclass, int maxHealth, int strength, int intelligence, int charisma){
        this.Name=name;
        this.Anccestry=anccestry;
        this.Heroclass=heroclass;

        this.maxHealth =maxHealth;
        this.strength=strength;
        this.intelligence=intelligence;
        this.charisma=charisma;
    }

    public Hero (String name,Anccestry anccestry,Heroclass heroclass){
        this(name, anccestry, heroclass, 100, 10, 5, 5);
        
    }




    public String getName() {
        return Name;
    }
    public String getAnccestry() {
        return Anccestry.toString(); ;
    }
    public String getHeroclass() {
        return Heroclass.toString();
    }
    public void setHealth(int Health) {
        if (Health < 0) {
            this.Health = 0;
        } else if (Health > this.maxHealth) {
            this.Health = this.maxHealth;
        } else {
            this.Health = Health;
        }
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






    public void gainExperiance(int xp){
        if (xp>=0){
            this.xp += xp;
        }

    }
}   
