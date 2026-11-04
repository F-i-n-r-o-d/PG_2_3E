public class Account {
    private String jmeno;
    private int cisloUctu;
    private int zustatek;

//Konstruktory
public Account(String jmeno, int cisloUctu, int zustatek){
    this.jmeno = jmeno;
    this.cisloUctu = cisloUctu;
    this.zustatek = zustatek;
}
public  Account(String jmeno, int cisloUctu){
    this(jmeno, cisloUctu, 1 );
}
//gettery
public String getJmeno(){
    return jmeno;
}
public int getcisloUctu(){
    return cisloUctu;
}
public int getzustatek(){
    return zustatek;
}

//setery
public void vklad(int castka){
    if (castka > 0) {
        zustatek = zustatek + castka;
    }
}
public boolean vyber(int castka){
    if (castka<zustatek){
        zustatek = zustatek - castka;
        return true;
    } else{
        System.out.println("Nedostatek prostředků");
        return  false;
    }
}
public boolean vyberSPoplatkem(int castka, int poplatek) {
    int celkem = castka + poplatek;
    if (celkem <= zustatek) {
        zustatek = zustatek - celkem;
        return true;
    } else {
        System.out.println("Nedostatek prostředků včetně poplatku");
        return false;
    }
}
}