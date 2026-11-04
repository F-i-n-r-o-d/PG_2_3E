public class Product {
    //atributy
    private final String NAME;
    private double price;
    private int amount;

    //konstruktory
    public Product(String NAME, double price, int amount) {
        this.NAME = NAME;
        this.price = price;
        if (amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    public Product(String NAME, double price){
        this(NAME,price,0);
    }

    //gettery
    public String getName(){
        return NAME;
    }

    public double getPrice(){
        return price;
   }
    
    public int getAmount(){
        return amount;
    }

   //settery
   public void changePrice(double price){
    if(price < 0){
        System.out.println("Nelze zadat zápornou hodnotu");
    } else {
        this.price = price;
        System.out.println("Cena produktu úspěšně změněna na: " + price + " Kč");
    }
   }

   public void changeAmount(int amount){
    if(amount < 0){
        System.out.println("Nelze zadat zápornou hodnotu");
    } else{
        this.amount=amount;
        System.out.println("Počet kusů úspěšně změněn na: " + amount + " Kč");
    }
   }

   //metody
   public void addAmount(int pocet){
    if(pocet<0){
       System.out.println("Nelze zadat zápornou hodnotu"); 
    } else{
        amount += pocet;
        System.out.println("Úspěšně přidáno "+ pocet + " kusů.");
        System.out.println("Na skladě je nyní " + amount + " kusů.");
    }
   }

   public void discountPercentage(double percentage){ 
    if(percentage<0||percentage>100){
        System.out.println("Zadejte hodnotu mezi 0 až 100");
    }else{
        price *= (100-percentage)/100;
        System.out.println("Nová cena: " + price);
    }
    }

    public void discountKoruna(int koruna){
        if(price - koruna <0){
            System.out.println("Cena nesmí klesnout pod nulu");
        } else{
            price -= koruna;
            System.out.println("Nová cena: " + price);
        }
    }

}
