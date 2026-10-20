
public class Main {
     public static void main(String[] args) {
        //instance
         bankaccount b1 = new bankaccount(584591855, "David Jusko");
         bankaccount b2 = new bankaccount(584591855, "David Jusko", -500 );
          
         
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
