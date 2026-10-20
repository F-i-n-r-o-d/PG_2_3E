public class Main {
    public static void main(String[] args) {
        // Vytvoření dvou účtů pomocí obou způsobů založení
        Account a1 = new Account("Jan Novák", 112233, 123);
        Account a2 = new Account("Josef Dvořák", 332211);

        System.out.println("Vklad hotovosti");
        System.out.println("Vklad 500 Kč");
        a1.vklad(500);
        System.out.println("Aktuální zůstatek: " + a1.getzustatek() + " Kč");
        
        System.out.println("-------------------------");
        System.out.println("Výběr (úspěšný)");
        int castkaKVyberu = 200;
        System.out.println("výběr " + castkaKVyberu + " Kč");
        boolean vysledek1 = a1.vyber(castkaKVyberu);
        System.out.println("Úspěšný výběr?" + (vysledek1 ? "ANO" : "NE"));
        System.out.println("Aktuální zůstatek: " + a1.getzustatek() + " Kč");
        
        System.out.println("-------------------------");
        System.out.println("Výběr s poplatkem");
        int castkaVyberuPoplatek = 100;
        int poplatek = 20;
        System.out.println("výběr " + castkaVyberuPoplatek + " Kč  poplatek: " + poplatek + " Kč");
        boolean vysledekPoplatek = a1.vyberSPoplatkem(castkaVyberuPoplatek, poplatek);
        System.out.println("Úspěšný výběr? " + (vysledekPoplatek ? "ANO" : "NE"));
        System.out.println("Aktuální zůstatek: " + a1.getzustatek() + " Kč");
        
        System.out.println("-------------------------");
        System.out.println("Zablokovaný výběr");
        int vysokyVyber = 99999;
        System.out.println("výběr " + vysokyVyber + " Kč...");
        boolean vysledek2 = a1.vyber(vysokyVyber);
        System.out.println("Úspěšný výběr? " + (vysledek2 ? "ANO" : "NE"));
        System.out.println("Aktální Zůstatek : " + a1.getzustatek() + " Kč");
    }

}