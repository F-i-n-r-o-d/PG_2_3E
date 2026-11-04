
public class BankUcet {
    
    private String cislo;
    public String majitel;
    private int zustatek;
    


    public BankUcet(String cislo, String majitel) {
        
        this.cislo = cislo;
        this.majitel = majitel;
        this.zustatek = 0;
          
        
    }
    
    public BankUcet(String cislo, String majitel, int zustatek) {
        
        this.cislo = cislo;
        this.majitel = majitel;
        if (zustatek < 0) {
            zustatek = 0;
            
        }
        this.zustatek = zustatek;
    }

    
    public int vklad(int castka){
        if (castka > 0) {
            zustatek = zustatek + castka;
        }
        return zustatek;
    }

    public String vyber (int vyber){
        String probehla;
        if (vyber <= zustatek) {
            zustatek = zustatek - vyber; 
            probehla = "ano";
        } else {probehla = "ne";}

        return probehla;
    }

    public String vyber(int vyber, int poplatek){
        String probehla;
        vyber = vyber + poplatek;
        if (vyber <= zustatek) {
            zustatek = zustatek - vyber; 
            probehla = "ano";
        } else {probehla = "ne";}

        return probehla;
    }

}
