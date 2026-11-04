public class Main {
    public static void main(String[] args) {
        BankovniUcet ucet1 = new BankovniUcet("123456", "Jan Novak");
        BankovniUcet ucet2 = new BankovniUcet("654321", "Petr Svoboda");

        ucet1.vlozit(5000);
        ucet1.vybrat(2000);
        ucet1.vybrat(5000);
        ucet1.vypisInformace();

        System.out.println();

        ucet2.vlozit(10000);
        ucet2.vybrat(3000);
        ucet2.vypisInformace();
    }
}