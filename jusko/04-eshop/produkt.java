public class produkt {
    private int cena;
    private String nazev;
    private int zasoby;

    //konstruktory

    public produkt(int cena, String nazev){
        if (cena < 0){
           this.cena = 0; 
        }
        else{this.cena = cena;}
        this.nazev = nazev;
        zasoby = 0;
    }

        public produkt(int cena, String nazev, int zasoby){
        if (cena < 0){
           this.cena = 0; 
        }
        else{this.cena = cena;}
        this.nazev = nazev;
        if (zasoby < 0){
           this.zasoby = 0; 
        }
        else{this.zasoby = zasoby;}

        //get set
    }
    public int getcena(){
        return cena;
    }
        public int getzasoby(){
        return zasoby;
    }
        public String getnazev(){
        return nazev;
    }
    public void setcena(int cena){
        if (cena < 0){
        }
        else{
            this.cena = cena;
        }  
    }
        public void setzasoby(int zasoby){
        if (zasoby < 0){
        }
        else{
            this.zasoby = zasoby;
        }
        }
        //metody

        public void pluszbozi(int plus){
            if(plus <0){
                System.out.println("zadané přidané zboží je v mínusu");
            }
            else{
                zasoby += plus;
            }
        }
            public void slevaA(double procenta){
            if(procenta > 100 || procenta < 0){
                System.out.println("Zadananá procenti sleva přesahuje 100% nebo je menší než 0%");
            }
            else{
                double p = cena*(procenta/100);
                double o = cena - cena*(procenta/100);
                cena = (int) o;
               System.out.println("cena činí " + p + " Kč a výsledná cena je " + o + " Kč" );
            }
        }
            public void slevaB(int suma){
            if(suma > cena || suma < 0){
                System.out.println("zadaná sleva je větší než cena a nebo sleva je v mínusových hodnotách");
            }
            else{
                int p = cena - suma;
                cena = p;
               System.out.println("cena činí " + p + " Kč a výsledná cena je " + cena + " Kč"  );
            }
        }
}
