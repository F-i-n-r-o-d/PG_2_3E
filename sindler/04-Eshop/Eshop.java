public class Eshop{
    private String itemName;
    private double prize;
    private int stockQuantity;

    public Eshop(String itemName, double prize) {
        this.itemName = itemName;
        this.prize = prize >= 0 ? prize : 0.0;
        this.stockQuantity = 0;
    }

    public Eshop(String itemName, double prize, int stockQuantity) {
        this.itemName = itemName;
        this.prize = prize >= 0 ? prize : 0.0;
        this.stockQuantity = stockQuantity >= 0 ? stockQuantity : 0;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrize() {
        return prize;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setPrize(double prize) {
        if (prize >= 0) {
            this.prize = prize;
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        }
    }

    public void restock(int pieces) {
        if (pieces > 0) {
            this.stockQuantity += pieces;
        }
    }

    public double discountPercent(double percent) {
        if (percent >= 0 && percent <= 100) {
            System.out.println("Sleva byla aplikována. Nová cena: " + (prize * (1 - percent / 100.0)));
            return prize * (1 - percent / 100.0);
        }
        System.out.println("Chyba: Procentní sleva musí být mezi 0 a 100.");
        return prize;
    }

    public double discountFixed(double discountPrice) {
        if (discountPrice > 0) {
            double newPrice = prize - discountPrice;
            System.out.println("Sleva byla aplikována. Nová cena: " + newPrice);
            return newPrice >= 0 ? newPrice : 0.0;
        }
        System.out.println("Chyba: Sleva musí být kladná.");
        return prize;
    }
}
