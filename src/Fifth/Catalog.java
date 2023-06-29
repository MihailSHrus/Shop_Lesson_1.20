package Fifth;
import java.util.Scanner;

public enum Catalog implements Showable, Scanable {
    Конфеты,
    Печенье,
    Газировка,
    Оплатить_Покупки,
    Посмотреть_корзину,
    Выход;

    public void show() {
        System.out.println("-Каталог-");
        for (Catalog all : Catalog.values()) {
            System.out.println(all.ordinal() + " - " + all);
        }
    }
    public int scan() {
        System.out.println("Введите цифру раздела, чтобы посмотреть товары.");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
