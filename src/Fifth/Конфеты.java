package Fifth;

import java.util.Scanner;

public enum Конфеты {
    Ромашка,
    Ириски,
    СТЕП,
    Назад;

    public void show() {
        System.out.println("-Конфеты-");
        for (Конфеты all : Конфеты.values()) {
            System.out.println(all.ordinal() + " - " + all);
        }
    }
    public int scan() {
        System.out.println("Введите цифру товара, чтобы добавить его в корзину.");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }

}
