public class Main {
    public static void main(String[] args) {

        Product p = new Product("Sluchátka", 1000, 5);
        System.out.println(p.getName() + ": cena " + p.getPrice() + " Kč, sklad " + p.getStock() + " ks");

        Product p2 = new Product("Myš", 500);
        System.out.println(p2.getName() + ": sklad " + p2.getStock() + " ks");

        Product p3 = new Product("Chyba", -100, -5);
        System.out.println("Záporné hodnoty: cena " + p3.getPrice() + ", sklad " + p3.getStock());

        p.setPrice(-50);
        System.out.println("Po setPrice(-50): " + p.getPrice());
        p.setStock(-1);
        System.out.println("Po setStock(-1): " + p.getStock());

        p.restock(10);
        System.out.println("Po naskladnění 10 ks: " + p.getStock());

        System.out.println("Cena po slevě 20 %: " + p.priceAfterPercentDiscount(20));

        System.out.println("Cena po slevě 300 Kč: " + p.priceAfterFixedDiscount(300));

        System.out.println("Cena po slevě 5000 Kč: " + p.priceAfterFixedDiscount(5000));
    }
}