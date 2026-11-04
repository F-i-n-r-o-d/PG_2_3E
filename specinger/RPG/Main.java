package specinger.RPG;
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Aragorn",);
    System.out.println("Welcome to the RPG game!");
    System.out.println("Name: " + h1.getName());
    System.out.println("Ancestry: "+ h1.getAncestry());
    System.out.println("Hero class: " + h1.getHeroClass());
    System.out.println("Health: " + h1.getHealth() + "/" + h1.getMaxHealth()); 
    System.out.println("Strenght: " + h1.getStrenght());
    System.out.println("Agility: " + h1.getAgility());
    System.out.println("Intelligence: " + h1.getIntelligence());
    System.out.println("Charisma: " + h1.getCharisma());
    System.out.println("Level: " + h1.getLevel());
    System.out.println("Exp: " + h1.getExp()); 
} 

}