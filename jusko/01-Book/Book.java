public class Book {
    
    // 1. Privátní atributy
    private String title;
    private String author;
    private final int PAGES;
    private int actualPage;

    // 2. Hlavní konstruktor
    public Book(String title, String author, int PAGES, int actualPage) {
        this.title = title;
        this.author = author;
        this.PAGES = PAGES;
        this.actualPage = actualPage;
    }

    // 3. Přetížený konstruktor (volá hlavní přes this)
    public Book(String title, String author, int PAGES) {
        this(title, author, PAGES, 1); // Nastaví actualPage na 1
    }

    public String getTitle(){
        return title;
    }
    public int getActualPage(){
        return actualPage;
    }
    
    public void setActualPage(int actualPage){
        if (actualPage > 0 && actualPage < PAGES){
            this.actualPage = actualPage;
        }
        else{
            System.out.print("taková stránka neexistuje");
        }
    }

    @Override 
    public String toString(){
        return "Book(" + "title= " + title + ", " + "author= " + author + ", " + "pages= " + PAGES; 
    }
}
