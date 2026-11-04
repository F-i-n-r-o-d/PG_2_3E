public class Main {
    public static void main(String[] args) {
        ZavodniAutomobil auto1 =
                new ZavodniAutomobil("Ferrari", 320, 50);

        ZavodniAutomobil auto2 =
                new ZavodniAutomobil("Lamborghini", 300, 40);

        auto1.zrychlit(100);
        auto1.zrychlit(250);
        auto1.spotrebovatPalivo(10);
        auto1.vypisInformace();

        System.out.println();

        auto2.zrychlit(150);
        auto2.brzdit();
        auto2.spotrebovatPalivo(5);
        auto2.vypisInformace();
    }
}