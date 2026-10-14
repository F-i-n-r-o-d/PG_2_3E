public class Main {

    public static void main(String[] args) {
        // Vytvoření 2 instancí
        Book b1 = new Book("1984", "George Orwell", 328, 50);
        Book b2 = new Book("Zaklínač", "A. Sapkowski", 340);
        Book b3 = new Book("Hobit", "J. R. R. Tolkien", 310, 100);

        // String title1 = b1.getTitle();
        // String title2 = b2.getTitle();
        // String title3 = b3.getTitle();

        System.out.println("---------------------------------------------------------");

        System.out.println(b1.toString());
        System.out.println("Aktuální stránka: " + b1.getActualPage());
        b1.setActualPage(100);
        System.out.println("Aktuální stránka po změně: " + b1.getActualPage());

        System.out.println("---------------------------------------------------------");
        // System.out.println("Kniha 1: " + title1);
        // System.out.println("Kniha 2: " + title2);
        // System.out.println("Kniha 3: " + title3);

        // System.out.println(b1.getTitle());
        // System.out.println(b2.getTitle());
        // System.out.println(b3.getTitle());


    }
    
}