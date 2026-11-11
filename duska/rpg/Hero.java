
public class Hero {
        private String name;
        private Anccestry anccestry;
    private Heroclass heroclass;

    private int health; 
    private int maxHealth;
    private int strength;
    private int agility;
    private int intelligence;
    private int charisma;
    private int level=1;
    private int xp=0;

    public int AbilityPoints = 0;

    public Hero (String name, Anccestry anccestry, Heroclass heroclass, int maxHealth, int strength, int agility, int intelligence, int charisma){
        if (name==null || name.length() < 4){
            System.out.println("Špatně zadaný parametr jména.");
        } else{

            this.name=name;
        this.anccestry=anccestry;
        this.heroclass=heroclass;

        this.maxHealth =maxHealth;
        this.strength=strength;
        this.agility=agility;
        this.intelligence=intelligence;
        this.charisma=charisma;

        this.health=maxHealth;
        }
        
        
    }

    public Hero (String name, Anccestry anccestry, Heroclass heroclass){
        
        this(name, anccestry, heroclass, 100, 10, 5, 5, 5);
        
        
    }




    public String getname() {
        return name;
    }
    public String getanccestry() {
        return anccestry.toString(); 
    }
    public String getheroclass() {
        return heroclass.toString();
    }
    public void sethealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > this.maxHealth) {
            this.health = this.maxHealth;
        } else {
            this.health = health;
        }

    }

    public int gethealth() {
        return health;
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






    public void gainExperience(int xp){
        if (xp>=0){
            this.xp += xp;

        }
        

        
        
          //  int cilxp = cillev * 50 + 2;
        int nextLvlXp = (int)Math.pow(level +1, 2)*50 + (int)Math.pow(2, level +1);

        while(this.xp>= nextLvlXp){

            
            this.level++;
            this.health = this.maxHealth;
            this.AbilityPoints +=3;
            nextLvlXp = (int) Math.pow(level +1, 2)*50 + (int) Math.pow(2, level +1);
          
            
        }


        

    }

    public void allocateStat(HeroStats statname, int points) {
        if (this.AbilityPoints >= points && points > 0) {
            switch (statname) {
                case STRENGTH:
                    this.strength += points;
                    this.AbilityPoints -= points;
                    System.out.println("Síla + " + points);
                    break;
                case AGILITY:
                    this.agility += points;
                    this.AbilityPoints -=points;
                    System.out.println("Obratnost + " + points);
                    break;
                case INTELLIGENCE:
                    this.intelligence += points;
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
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0; 
            }
            System.out.println(this.name + " zraněn. Zbývá mu " + this.health + " životů.");
        }
    }

    public boolean isAlive() {
        return this.health > 0; 
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
