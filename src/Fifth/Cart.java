package Fifth;

import java.util.ArrayList;

public class Cart {
    public ArrayList<String> cart = new ArrayList<>();
    public void getCart() {
        System.out.println("-Ваша корзина-");
        for (String a: cart) {
            System.out.println("<" + a + ">");
        }
        if (cart.isEmpty()) {
            System.out.println("*Пусто*");
        }
    };
    public void buy(String item) {
        cart.add(item);
        System.out.println("<В вашу корзину добавлено - " + item +">");
    }
}
