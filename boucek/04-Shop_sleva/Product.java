public class Product {
    private final String NAME;
    private final double PRICE;
    private int amount;

    public Product(String NAME, double PRICE, int amount) {
        this.NAME = NAME;
        this.PRICE = PRICE;
        if (amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    public Product(String NAME, double PRICE) {
        this(NAME, PRICE, 0);
    }

    public String getName() {
        return this.NAME;
    }

    public double getPrice() {
        return this.PRICE;
    }

    public int getAmount() {
        return this.amount;
    }

    public void addAmount(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    public double discountPrice(double discount) {
        if (discount > 100) {
            return 0;
        }
        discount = 1 - (discount / 100);
        if (discount >= 0 && discount <= 1) {
            return (this.PRICE * discount);
        }
        return this.PRICE;
    }

    public double discountSet(double discount) {
        if ((PRICE-discount) < 0 && discount > 0) {
            return 0;
        }
        if (discount < 0) {
            return PRICE;
        }
        return PRICE-discount;
    }
}