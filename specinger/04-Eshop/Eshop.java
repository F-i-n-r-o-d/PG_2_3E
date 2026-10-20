    public class Eshop{
    private String nazev;
    private double cena;
    private int zasoba;
 //konstruktory
    public Eshop(String nazev, int cena){
        this.nazev = nazev;
        this.cena = cena >= 0 ? cena : 0;
        this.zasoba = 0;
    }
    public Eshop(String nazev, int cena, int zasoba){
        this.nazev = nazev;
        this.cena = cena >= 0 ? cena : 0;
        this.zasoba = zasoba >= 0 ? zasoba : 0;
    }
//gettery
    public String getNazev(){
        return nazev;
    }
    public double getCena(){
        return cena;
    }
    public int getZasoba(){
        return zasoba;
    }
//setery
    public void naskladneni(int pocet){
        if (pocet > 0){
            zasoba = zasoba + pocet;
        }
    }
    public double slevaProcenta(double procento){
        if (procento >= 0 && procento <= 100){
            return cena * (1 - procento / 100);
        }
        return cena;
    }
    public double slevaVKorunach(double castka){
        if (castka > 0){
            double vysledek = cena - castka;
            return vysledek >= 0 ? vysledek : 0;
        }
        return cena;
    }
    }
