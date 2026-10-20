
public class zavod{

    private int maxrychlost;
    private String znacka;
    private int rychlost;
    private double  palivo;


    public zavod(String znacka, int maxrychlost ){
    this.maxrychlost = maxrychlost;
    this.znacka = znacka;
    palivo = 20;
    rychlost = 0;
    }
    public zavod(String znacka, int maxrychlost, double palivo ){
    this.maxrychlost = maxrychlost;
    this.znacka = znacka;
    this.palivo = palivo;
    rychlost = 0;
    }
  

    public int getmaxrychlost(){
        return maxrychlost;
    }
    public int getrychlost(){
        return rychlost;
    }
    public double getpalivo(){
        return palivo;
    }
    public String getznacka(){
        return znacka;
    }
    public void setpalivo(int palivo ){
        if( palivo >= 0){
            this.palivo = palivo;
        }
        else{ System.out.println("palivo nemůže být v mínusu");}
    }
  
    public void zastaveni(){
        rychlost = 0;
    }
    public void zrychleniA(){
        if (maxrychlost >= 10+rychlost && palivo >= 0.5  && rychlost >= 0 ){
            rychlost += 10;
            palivo -= 0.5;
        }
    }
    public void zrychleniB(int rychlost){
        if (maxrychlost >= this.rychlost + rychlost && palivo >= 0.05*rychlost  && rychlost >= 0){
            this.rychlost += rychlost;
            palivo -= 0.05*rychlost;
        }
    }
    public void brzdeni(int brzda){
        if( brzda > 0 && brzda <= rychlost ){
            rychlost -= brzda;
        }
    }
}
