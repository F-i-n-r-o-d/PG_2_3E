public class Main {
        public static void main(String[] args) {
        Eshop e1 = new Eshop("Notebook", -5000);
        Eshop e2 = new Eshop("Telefon", 8900, 40);

        System.out.println("Naskladnění zboží ");
        System.out.println("Naskladním 10x " + e1.getNazev());
        e1.naskladneni(10);
        System.out.println("Zásoba po naskladnění: " + e1.getZasoba() + " ks");

        System.out.println("----------------------------------");
        System.out.println("Výpočet slevy v procentech");
        double procento = 20;
        double cenaProcenta = e2.slevaProcenta(procento);
        System.out.println("Původní cena: "  + e2.getCena() + " Kč");
        System.out.println("zlevnění: " + procento + "%");
        System.out.println("Cena po zlevnění " + cenaProcenta + " Kč");

        System.out.println("----------------------------------");
        System.out.println("Výpočet slevy v korunách ");
        double sleva = 1000;
        double cenaProcenta2 = e2.slevaVKorunach(sleva);
        System.out.println("Původní cena "  + e2.getCena() + " Kč");
        System.out.println("zlevnění: " + sleva + "Kč");
        System.out.println("Cena po zlevnění " + cenaProcenta2 + " Kč");
    }
}
