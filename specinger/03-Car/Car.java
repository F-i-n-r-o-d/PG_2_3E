public class Car {
    private String znacka;
    private int aktualniRychlost;
    private int maximalniRychlost;
    private double palivo;
//konstruktory
    public Car(String znacka, int maximalniRychlost){
        this.znacka = znacka;
        this.maximalniRychlost = maximalniRychlost;
        this.aktualniRychlost = 0;
        this.palivo = 20.0;
    }
    public Car(String znacka, int maximalniRychlost, double palivo){
        this.znacka = znacka;
        this.maximalniRychlost = maximalniRychlost;
        this.aktualniRychlost = 0;
        this.palivo = palivo >= 0 ? palivo : 0;
    }
//gettery
    public String getZnacka(){
        return znacka;
    }
    public int getAktualniRychlost(){
        return aktualniRychlost;
    }
    public int getMaximalniRychlost(){
        return maximalniRychlost;
    }
    public double getPalivo(){
        return palivo;
    }
//settery
    public boolean zrychleni(){
        if (palivo >= 0.5 && aktualniRychlost + 10 <= maximalniRychlost) {
            aktualniRychlost = aktualniRychlost + 10;
            palivo = palivo - 0.5;
            return true;
        }
        return false;
    }
    public boolean zrychleni(int hodnota){
        if (hodnota > 0 && palivo >= 0.5 && aktualniRychlost + hodnota <= maximalniRychlost) {
            aktualniRychlost = aktualniRychlost + hodnota;
            palivo = palivo - 0.5;
            return true;
        }
        return false;
    }
    public void zastaveni(){
        aktualniRychlost = 0;
    }
}