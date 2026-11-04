

public class Main {

    public static void main(String[] args) {
        
        BankUcet b1 = new BankUcet("0000001/1234", "Jan Novák", 2000);
        BankUcet b2 = new BankUcet("0000002/1234", "Tomáš Novotný");

        
        System.out.println(b2.vklad(3000));
        System.out.println(b1.vyber(200));
        System.out.println(b2.vyber(800, 100));
        System.out.println(b1.vyber(2000));
    }
      
}

