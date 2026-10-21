public class Main {
    public static void main(String[] args) {
        Eshop item1 = new Eshop("Smartphone", 8000.0, 5);
        Eshop item2 = new Eshop("Notebook", 15000.0, 10);

        System.out.println("-----------------");
        System.out.println("Původní cena " + item1.getItemName() + ": " + item1.getPrize());
        System.out.println("Původní cena " + item2.getItemName() + ": " + item2.getPrize());
        System.out.println("-----------------");

        item1.setPrize(7500.0);

        System.out.println("-----------------");
        System.out.println("Nová cena po změně ceny " + item1.getItemName() + ": " + item1.getPrize());
        System.out.println("-----------------");

        item1.discountPercent(10);
        item2.discountFixed(200);

        System.out.println("-----------------");   
        System.out.println("Nová cena po slevě za " + item1.getItemName() + " je: " + item1.getPrize());
        System.out.println("Nová cena po slevě za " + item2.getItemName() + " je: " + item2.getPrize());
        System.out.println("-----------------");

        item1.restock(3);
        item2.restock(5);

        System.out.println("-----------------");
        System.out.println("Nové množství na skladě pro " + item1.getItemName() + ": " + item1.getStockQuantity());
        System.out.println("Nové množství na skladě pro " + item2.getItemName() + ": " + item2.getStockQuantity());
        System.out.println("-----------------");
    }
}
