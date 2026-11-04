
public class Main {
     public static void main(String[] args){
        zavod aut1 = new zavod("BMW", 400);
        zavod aut2 = new zavod("Ferari", 400, 20 );

        aut1.zrychleniA();
        System.out.println(aut1.getrychlost());
        aut1.zrychleniB(200);
        System.out.println(aut1.getrychlost());
        System.out.println(aut1.getpalivo());
        aut1.setpalivo(0);
        aut1.zrychleniB(200);
        System.out.println(aut1.getpalivo());
        aut1.zrychleniB(100);
        System.out.println(aut1.getrychlost());
     }
}
