public class Main {
    public static void main(String[] args) {
        PolozkaEshopu produkt1 =
                new PolozkaEshopu("Fotbalovy mic", 1000, 10);

        PolozkaEshopu produkt2 =
                new PolozkaEshopu("Brankarske rukavice", 2000, 5);

        produkt1.naskladnit(5);
        System.out.println("Cena po sleve 20 %: "
                + produkt1.vypocetSlevy(20) + " Kc");
        produkt1.vypisInformace();

        System.out.println();

        System.out.println("Cena po sleve 300 Kc: "
                + produkt2.vypocetSlevyFixni(300) + " Kc");
        produkt2.naskladnit(3);
        produkt2.vypisInformace();
    }
}