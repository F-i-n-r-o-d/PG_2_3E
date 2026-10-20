public class Product {
    private final String NAME;
    private double price;
    private int amount;

    public Product(String NAME, double price, int amount) {
        this.NAME = NAME;
        this.price = price;
        if (amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    public Product(String NAME, double price) {
        this(NAME, price, 0);
    }

    public String getName() {
        return this.NAME;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public void addAmount(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    public int changePrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        return (int) this.price;
    }

    public double discountPrice(double discount) {
        if (discount > 100) {
            return 0;
        }
        discount = 1 - (discount / 100);
        if (discount >= 0 && discount <= 1) {
            return (this.price * discount);
        }
        return this.price;
    }

    public double discountSet(double discount) {
        if ((price-discount) < 0 && discount > 0) {
            return 0;
        }
        if (discount < 0) {
            return price;
        }
        return price-discount;
    }
}