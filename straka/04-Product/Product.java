public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price >= 0 ? price : 0;
        this.stock = stock >= 0 ? stock : 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void restock(int amount) {
        if (amount > 0) {
            stock += amount;
        }
    }

    public double priceAfterPercentDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            return price;
        }
        return price * (1 - percent / 100);
    }

    public double priceAfterFixedDiscount(double amount) {
        if (amount < 0) {
            return price;
        }
        double result = price - amount;
        return result >= 0 ? result : 0;
    }
}