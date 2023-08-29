import shoppingCart.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Monitor 34 polegadas", 3999.0, 1);
        shoppingCart.addItem("iPad Pro 12,9 128GB Spacial Gray with Apple Pensil 1gen", 14990.0, 1);
        shoppingCart.addItem("Keychron k8 Pro", 890.0, 1);
        shoppingCart.addItem("Mouse Ergonomico Logitech", 390.0, 1);
        shoppingCart.addItem("HDMI Splitter 1x2", 35.0, 1);

        shoppingCart.showItems();
        System.out.println("O preço total do seu carrinho é de R$ " + shoppingCart.calculateTotalValue());

        shoppingCart.removeItem("HDMI splitter 1x2");

        shoppingCart.showItems();

        System.out.println("\nCarrinho Atualizado!");
        System.out.println("O preço total do seu carrinho é de R$ " + shoppingCart.calculateTotalValue());
    }
}