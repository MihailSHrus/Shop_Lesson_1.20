package Fifth;

import java.util.Scanner;

public enum Газировка {
    Пепси,
    Кока_кола,
    Ситро,
    Назад;

    public void show() {
        System.out.println("-Газировка-");
        for (Газировка all : Газировка.values()) {
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
