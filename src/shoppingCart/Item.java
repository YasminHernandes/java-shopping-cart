package shoppingCart;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        String s = "\nItem { " +
                "NAME: '" + name + "\'" +
                " PRICE: " + price +
                " QUANTITY: " + quantity +
                "}";
        return s;
    }
}
