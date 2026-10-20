public class Main {
     public static void main(String[] args) {

         bankaccount b1 = new bankaccount(876989876, "Matyáš Pohorský");
         bankaccount b2 = new bankaccount(876989875, "Matyáš Pohorský", -1000 );
          
         
        b1.vklad(500);
        System.out.println(b1.getzustatek());
        b1.vklad(-500);
        System.out.println(b1.getzustatek());
        b1.vyberA(200);
        System.out.println(b1.getzustatek());
        b1.vyberB(100);
        System.out.println(b1.getzustatek());
        b1.vyberA(200);
        
     }
}