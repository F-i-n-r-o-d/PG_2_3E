public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Televize", 10000);
        Product p2 = new Product("Rohlík", 3.5, -200);
        info(p1);
        info(p2);
        System.out.println("-----------------------------------------");
        p1.addAmount(6);
        p2.addAmount(-53);
        System.out.println("Počet kusů po přidání 6 k " + p1.getName() + ": " + p1.getAmount());
        System.out.println("Počet kusů po přidání -53 k " + p2.getName() + ": " + p2.getAmount());
        System.out.println("-----------------------------------------");
        System.out.println("Cena po slevě 10% k " + p1.getName() + ": " + p1.discountPrice(10));
        System.out.println("Cena po slevě 300 Kč k " + p2.getName() + ": " + p2.discountSet(300));
        System.out.println("------------------------------------------");
        System.out.println("Cena po slevě 110% k " + p1.getName() + ": " + p1.discountPrice(110));
        System.out.println("Cena po slevě -890 Kč k " + p2.getName() + ": " + p2.discountSet(-890));



    }

    private static void info(Product p) {
        System.out.println("----------------------------------------");
        System.out.println("Název: " + p.getName());
        System.out.println("Cena: " + p.getPrice());
        System.out.println("Množství: " + p.getAmount());
    }
}
