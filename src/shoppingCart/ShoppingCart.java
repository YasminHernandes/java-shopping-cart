package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemsList;


    public ShoppingCart() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        this.itemsList.add(item);
        System.out.println("\nItem adicionado ao carrinho!");
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();

        if(!itemsList.isEmpty()) {
            for(Item i: itemsList) {
                if(i.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(i);
                    System.out.println("\nItem removido do carrinho!");
                }
            }
            itemsList.removeAll(itemsToRemove);
        } else {
            System.out.println("Seu carrinho está vazio!");
        }
    }
    public double calculateTotalValue() {
        double totalValue = 0d;

        if(!itemsList.isEmpty()) {
            for(Item item: itemsList) {
                double itemValue = item.getPrice() * item.getQuantity();
                totalValue += itemValue;
            }
            return totalValue;
        } else {
            throw new RuntimeException("Seu carrinho está vazio!");
        }
    }

    public void showItems() {
        if(!itemsList.isEmpty()) {
            System.out.println(this.itemsList);
        } else {
            System.out.println("Seu carrinho está vazio!");
        }
    }

    @Override
    public String toString() {
        return "ShoppingCard {" +
                "itens: " + itemsList +
                '}';
    }

}
