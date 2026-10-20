public class Main {
    public static void main(String[] args){
        produkt p1 = new produkt(25,"auto");
        produkt p2 = new produkt(750,"telefon", 70);

        p1.setcena(-5);
        System.out.println(p1.getcena());
        p1.pluszbozi(50);
        System.out.println(p1.getzasoby());
        p2.slevaA(50);
        System.out.println(p2.getcena());
         p2.slevaB(80);
         System.out.println(p2.getcena());
    }
}
