
public class Hero {
        private String Name;
        private Anccestry Anccestry;
    private Heroclass Heroclass;

    private int Health; 
    private int MaxHealth;
    private int Strength;
    private int Agility;
    private int Intelligence;
    private int Charisma;
    private int Level=1;
    private int Xp=0;

    public int AbilityPoints = 0;

    public Hero (String name, Anccestry anccestry, Heroclass heroclass, int maxHealth, int strength, int agility, int intelligence, int charisma){
        if (name==null || name.length() < 4){
            System.out.println("Špatně zadaný parametr jména.");
        } else{

            this.Name=name;
        this.Anccestry=anccestry;
        this.Heroclass=heroclass;

        this.MaxHealth =maxHealth;
        this.Strength=strength;
        this.Agility=agility;
        this.Intelligence=intelligence;
        this.Charisma=charisma;

        this.Health=maxHealth;
        }
        
        
    }

    public Hero (String name, Anccestry anccestry, Heroclass heroclass){
        
        this(name, anccestry, heroclass, 100, 10, 5, 5, 5);
        
        
    }




    public String getName() {
        return Name;
    }
    public String getAnccestry() {
        return Anccestry.toString(); 
    }
    public String getHeroclass() {
        return Heroclass.toString();
    }
    public void setHealth(int Health) {
        if (Health < 0) {
            this.Health = 0;
        } else if (Health > this.MaxHealth) {
            this.Health = this.MaxHealth;
        } else {
            this.Health = Health;
        }

    }

    public int getHealth() {
        return Health;
    }
    public int getStrength() {
        return Strength;
    }
    public int getAgility() {
        return Agility;
    }
    public int getIntelligence() {
        return Intelligence;
    }
    public int getCharisma() {
        return Charisma;
    }
    public int getLevel() {
        return Level;
    }
    public int getXp() {
        return Xp;
    }






    public void gainExperiance(int xp){
        if (xp>=0){
            this.Xp += xp;

        }
        int cillev = this.Level *1;

        
          //  int cilxp = cillev * 50 + 2;
        int nextLvlXp = Math.powExact(Level+1, 2)*50 + Math.powExact(2, Level+1);

        while(xp>= nextLvlXp){
            this.Level++;
            this.Health = this.MaxHealth;
            this.AbilityPoints +=3;
            nextLvlXp = Math.powExact(Level+1, 2)*50 + Math.powExact(2, Level+1);
        }

    }
}   

enum Anccestry {
    HUMAN, ELF, DWARF
}

enum Heroclass {
    WARRIOR, RANGER, MAGE
}
