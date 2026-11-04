package specinger.RPG;

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
    private int exp = 0;
    private int abilityPoints = 0;

    public Hero(String name, Ancestry ancestry,HeroClass heroClass, int maxHealth, int strength, int agility, int intelligence, int charisma){
        this.name = name;
        this.ancestry = ancestry;
        this.heroClass = heroClass;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public Hero (String name, Ancestry ancestry, HeroClass heroClass){
            this(name, ancestry, heroClass, 100, 10, 5, 5, 5 );
    }

    public Hero (String name, Ancestry ancestry, int maxHealth, HeroClass heroClass){
         this(name, ancestry, heroClass, maxHealth, 10, 5, 5, 5);
    }

    public String getName(){
        return name;
    }
    public Ancestry getAncestry(){
        return ancestry;
    }
    public HeroClass getHeroClass(){
        return heroClass;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        if (health<0) {
            this.health = 0;
        } else if (health> maxHealth){
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getStrength(){
        return strength;
    }
    public int getAgility(){
        return agility;
    }
    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }
     public int getExp() {
        return exp;
    }
    public int getLevel(){
        return level;
    }
    public void gainExperience(int exp){
        if (exp >=0 ){
            this.exp += exp;
    }
    int nextLvlXp = Math.powExact(level+1,2)*50+ Math.powExact(2, level+1);
    while(exp >= nextLvlXp){
        this.level++;
        this.health = this.maxHealth;
        this.abilityPoints += 3;
        nextLvlXp =  Math.powExact(level+1,2)*50+ Math.powExact(2, level+1);
    }

}
}