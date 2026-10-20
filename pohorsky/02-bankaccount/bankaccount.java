public class bankaccount{
    private int cislo;
    private String jmeno;
    private int zustatek;

     
    public bankaccount( int cislo, String jmeno ){
        this.cislo = cislo;
        this.jmeno = jmeno;
        zustatek = 0;
    }
    public bankaccount( int cislo, String jmeno, int zustatek ){
        this.cislo = cislo;
        this.jmeno = jmeno;
        if (zustatek > 0){
            this.zustatek = zustatek;
        }
        else{ this.zustatek = 0;}
    }
    

    public void vklad(int castka){
        if (castka > 0){
            zustatek += castka;
        }
    }
        public void vyberA(int castka){
        if (castka >= 0 && castka <= zustatek){
            zustatek -= castka;
            System.out.println("úspěšný výběr");
        }
        else{System.out.println("navrhovaná vybraná částka přesahuje stav účtu nebo je mínusová"); }
    }
     public void vyberB(int castka){
        if ((castka + 10) > 0 && (castka + 10) <= zustatek){
            zustatek -= (castka +10);
            System.out.println("úspěšný výběr s poplatkem " + 10 + " Kč" );
        }
        else{System.out.println("navrhovaná vybraná částka přesahuje stav účtu nebo je mínusová"); }
    }


    public int getcislo(){
        return cislo;
    }
    public int getzustatek(){
        return zustatek;
    }
    public String getjmeno(){
        return jmeno;
    }
    public void setjmeno(String jmeno){
        this.jmeno = jmeno;
    }

}
