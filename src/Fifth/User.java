package Fifth;

import java.util.Scanner ;
public class User{
    public void login() {
        System.out.println("Чтобы вопользоваться каталогом, пожалуйста, введите данные пользователя.");
        System.out.print("Логин: ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.print("Пароль: ");
        String pass = scan.nextLine();
    }
    public boolean buy(Cart cart) {
        System.out.println("Готовы завершить покупки?");
        cart.getCart();
        System.out.println("0 - Продолжить покупки, 1 - Закончить покупки");
        return(scan());
    }
    public boolean scan() {
        do {
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 0:
                    return false;
                case 1:
                    return true;
                default:
                    System.out.println("Система не может считать ответ" + "\n" + "Пожалуйста, попробуйте снова");
            }
        } while (true) ;
    }


}
