
package niscak.BankaAutoStore;

public class Product {

    private String productName;
    private double productCost;
    private int productAvailability;

    public Product(String productName, double productCost) {
        this.productName = productName;

        if (productCost > 0) {
            this.productCost = productCost;
        } else {
            this.productCost = 0;
            System.out.println("Cena nesmi byt zaporna ani nulova.");
        }

        this.productAvailability = 0;
    }

    public Product(String productName, double productCost, int productAvailability) {
        this.productName = productName;

        if (productCost > 0) {
            this.productCost = productCost;
        } else {
            this.productCost = 0;
            System.out.println("Cena nesmi byt zaporna ani nulova.");
        }

        if (productAvailability >= 0) {
            this.productAvailability = productAvailability;
        } else {
            this.productAvailability = 0;
            System.out.println("Pocet kusu nemuze byt zaporny.");
        }
    }

    public String getProductName() {
        return productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public int getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(int pocetKusu) {
        if (pocetKusu < 0) {
            System.out.println("Pocet kusu nemuze byt zaporny.");
        } else {
            this.productAvailability += pocetKusu;
            System.out.println("Naskladneno kusu: " + pocetKusu);
            System.out.println("Aktualni pocet kusu: " + this.productAvailability);
        }
    }

    public double slevaProcenta(double procenta) {
        if (procenta < 0 || procenta > 100) {
            System.out.println("Sleva musi byt mezi 0 a 100 procenty.");
            return this.productCost;
        }

        return this.productCost * (1 - procenta / 100);
    }

    public double slevaKc(double sleva) {
        if (sleva < 0) {
            System.out.println("Sleva nemuze byt zaporna.");
            return this.productCost;
        }

        double cena = this.productCost - sleva;

        if (cena < 0) {
            return 0;
        }

        return cena;
    }

    public static void main(String[] args) {

        Product klavesnice = new Product("Klavesnice", 1000, 10);
        Product mys = new Product("Mys", 500, 5);

        System.out.println("--- PRVNI PRODUKT ---");
        System.out.println("Nazev: " + klavesnice.getProductName());
        System.out.println("Cena: " + klavesnice.getProductCost() + " Kc");
        System.out.println("Skladem: " + klavesnice.getProductAvailability());
        System.out.println();

        System.out.println("--- NASKLADNENI KLAVESNICE ---");
        klavesnice.setProductAvailability(5);
        System.out.println();

        System.out.println("--- SLEVA NA KLAVESNICI ---");
        System.out.println("Cena po sleve 20 %: " + klavesnice.slevaProcenta(20) + " Kc");
        System.out.println("Cena po sleve 100 Kc: " + klavesnice.slevaKc(100) + " Kc");
        System.out.println();

        System.out.println("--- DRUHY PRODUKT ---");
        System.out.println("Nazev: " + mys.getProductName());
        System.out.println("Cena: " + mys.getProductCost() + " Kc");
        System.out.println("Skladem: " + mys.getProductAvailability());
        System.out.println();
        System.out.println("--- SLEVA NA MYSI ---");
        System.out.println("Cena po sleve 10 %: " + mys.slevaProcenta(10) + " Kc");
        System.out.println("Cena po sleve 50 Kc: " + mys.slevaKc(50) + " Kc");
    }
}

