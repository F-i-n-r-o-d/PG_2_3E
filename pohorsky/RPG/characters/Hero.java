package pohorsky.RPG.characters;

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
    private int abilityPoints = 0;

private Hero(String name, Ancestry ancestry,HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma) {
    
    if (name.length() < 3) {
        System.out.print("špatné jméno");
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



    public Hero(String name, Ancestry ancestry, HeroClass heroClass) {

        this(name, ancestry, heroClass, 100,10,5,5,5);

}
    public Hero(String name, Ancestry ancestry, HeroClass heroClass, int maxHealth) {
        this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5);
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
    public int getabilityPoints() {
        return abilityPoints;
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


 public void gainExperience(int xp){
        if (xp < 0){
        }
        else{ this.xp += xp;}
        int nextLvlxp = Math.powExact(level+1, 2)*50+Math.powExact(2, level+1);
        while(this.xp > nextLvlxp){
            level++;
            health = maxHealth;
            abilityPoints += 3;
            nextLvlxp = Math.powExact(level+1, 2)*50+Math.powExact(2, level+1);
        }
        nextLvlxp = Math.powExact(level+1, 2)*50+Math.powExact(2, level+1);
        System.out.println("Na další level potřebuješ" + (xp -= nextLvlxp));
    }



    public void allocateStat(HeroStats statName, int points){
        if( points > 0 && points > abilityPoints){
            switch(statName){
                case strength:{
                    strength += points;
                    break;
                }
                case agility:{
                    agility += points;
                    break;
                }
                case intelligence:{
                    intelligence += points;
                    break;
                }
                case charisma:{
                    charisma += points;
                    break;
                }
            }
            abilityPoints -= points;
        }
    }

    public void takeDamage(int damage){
        if (damage >= 0){
            this.health -= damage;
        }
    }
    public boolean isAlive(){
        if(this.health <= 0){
            return false;
        }
        else{
            return true;
        }
    }


}















