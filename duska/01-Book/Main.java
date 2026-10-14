public class Main {

    public static void main(String[] args) {
        // Vytvoření 2 instancí
        Book b1 = new Book("1984", "George Orwell", 328, 50);
        Book b2 = new Book("Zaklínač", "A. Sapkowski", 340);

        //String x = b1.title;
        //b1.title = "Nový název"; // Nemůžu ani přečíst ani přepsat. title je privat. (Zapouzdření)
        System.out.println(x);
        System.out.println(gettitle());
        System.out.println(getauthor());
        
        System.out.println(x);
    }
      

    
}