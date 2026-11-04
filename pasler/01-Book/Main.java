public class Main {

    public static void main(String[] args) {
        // Vytvoření 2 instancí
        Book b1 = new Book("1984", "George Orwell", 328, 50);
        Book b2 = new Book("Zaklínač", "A. Sapkowski", 340);

        System.out.println("---------------------------------");
        System.out.println(b1.toString());
        System.out.println("Aktuální stránka: " + b1.getActualPage());
        b1.setActualPage(1);
        System.out.println("Aktuální stránka po změně: " + b1.getActualPage());
        System.out.println("---------------------------------");


    }
    
}