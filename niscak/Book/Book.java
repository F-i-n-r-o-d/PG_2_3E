package niscak.Book;


public class Book {
    
    // 1. Privátní atributy
    private String title;
    private String author;
    private final int maxPages;
    private int actualPage;

    // 2. Hlavní konstruktor
    public Book(String title, String author, int maxPages, int actualPage) {
        this.title = title;
        this.author = author;
        this.maxPages = maxPages;
        this.actualPage = actualPage;
    }

    // 3. Přetížený konstruktor (volá hlavní přes this)
    public Book(String title, String author, int maxPages) {
        this(title, author, maxPages, 1); // Nastaví actualPage na 1
    }

    // 4. Gettery a Settery
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getMaxPages() {
        return maxPages;
    }
    public int getActualPage() {
        return actualPage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public void setActualPage(int actualPage) {
        if (actualPage >= 0 && actualPage <= maxPages) {
            this.actualPage = actualPage;
        } else {
            System.out.println("Chyba: Stránka musí být mezi 0 a " + maxPages);
        }
    }

    public static void main(String[] args) {
        // Vytvoření 2 instancí
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("Zaklínač", "A. Sapkowski", 340);

        // Výpis informací o knihách
        System.out.println("Kniha 1: " + b1.getTitle() + " od " + b1.getAuthor() + ", strana: " + b1.getActualPage() + "/" + b1.getMaxPages());
        System.out.println("Kniha 2: " + b2.getTitle() + " od " + b2.getAuthor() + ", strana: " + b2.getActualPage() + "/" + b2.getMaxPages());

        System.out.println("---------------------------------------------------------");
        // Změna aktuální stránky a výpis
        b1.setActualPage(100);
        System.out.println("Kniha 1 po změně: " + b1.getTitle() + " od " + b1.getAuthor() + ", strana: " + b1.getActualPage() + "/" + b1.getMaxPages());
        b2.setActualPage(350); // Mimo rozsah, mělo by vypsat chybu
        System.out.println("Kniha 2 po změně: " + b2.getTitle() + " od " + b2.getAuthor() + ", strana: " + b2.getActualPage() + "/" + b2.getMaxPages());
        System.out.println("---------------------------------------------------------");
    }
}
