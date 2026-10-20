public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Ponožky", 69.420, 500);
        Product product2 = new Product("Ponožky", 555.5);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.getAmount());
        System.out.println("--------------------------------------");
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.getAmount());
        System.out.println("--------------------------------------");
        product1.changePrice(99.9);
        product1.changePrice(-150);
        System.out.println("--------------------------------------");
        product2.addAmount(50);
        product1.discountPercentage(15);
        System.out.println("--------------------------------------");
        product2.discountKoruna(500);
        //cena jde do minusu
        product2.discountKoruna(69);



    }
}
