
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






    public void gainExperience(int xp){
        if (xp>=0){
            this.Xp += xp;

        }
        

        
        
          //  int cilxp = cillev * 50 + 2;
        int nextLvlXp = (int)Math.pow(Level +1, 2)*50 + (int)Math.pow(2, Level +1);

        while(this.Xp>= nextLvlXp){

            
            this.Level++;
            this.Health = this.MaxHealth;
            this.AbilityPoints +=3;
            nextLvlXp = (int) Math.pow(Level +1, 2)*50 + (int) Math.pow(2, Level +1);
          
            
        }


        

    }

    public void allocateStat(HeroStats statName, int points) {
        if (this.AbilityPoints >= points && points > 0) {
            switch (statName) {
                case STRENGTH:
                    this.Strength += points;
                    this.AbilityPoints -= points;
                    System.out.println("Síla + " + points);
                    break;
                case AGILITY:
                    this.Agility += points;
                    this.AbilityPoints -=points;
                    System.out.println("Obratnost + " + points);
                    break;
                case INTELLIGENCE:
                    this.Intelligence += points;
                    this.AbilityPoints -= points;
                    System.out.println("Inteligence + " +points);
                    break;
                default:
                    System.out.println("Tuto vlastnost nelze zlepšit.");
                    break;
            
            }
        } else {
            System.out.println("Nedostatek bodů");
        }
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.Health -= damage;
            if (this.Health < 0) {
                this.Health = 0; 
            }
            System.out.println(this.Name + " zraněn. Zbývá mu " + this.Health + " životů.");
        }
    }

    public boolean isAlive() {
        return this.Health > 0; 
    }
}   
 
enum Anccestry {
    HUMAN, ELF, DWARF
}

enum Heroclass {
    WARRIOR, RANGER, MAGE
}

enum HeroStats {
    STRENGTH, AGILITY, INTELLIGENCE
}
