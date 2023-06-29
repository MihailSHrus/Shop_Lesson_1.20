package Fifth;

public class Shop {
    public void run() {
        User u1 = new User();
        Cart c1 = new Cart();
        u1.login();
        boolean exit = false;
        do {
            Catalog catalog = Catalog.Выход;
            catalog.show();
            switch (catalog.scan()) {
                case 0:
                    Конфеты t3 = Конфеты.Ромашка;
                    t3.show();
                    switch (t3.scan()) {
                        case 0:
                            c1.buy("Ромашка");
                            break;
                        case 1:
                            c1.buy("Ириски");
                            break;
                        case 2:
                            c1.buy("СТЕП");
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 1:
                    Печенье t4 = Печенье.Курабье;
                    t4.show();
                    switch (t4.scan()) {
                        case 0:
                            c1.buy("Курабье");
                            break;
                        case 1:
                            c1.buy("Вафли");
                            break;
                        case 2:
                            c1.buy("Крекеры");
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    Газировка t5 = Газировка.Пепси;
                    t5.show();
                    switch (t5.scan()) {
                        case 0:
                            c1.buy("Пепси");
                            break;
                        case 1:
                            c1.buy("Кока_кола");
                            break;
                        case 2:
                            c1.buy("Ситро");
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    if (u1.buy(c1)) {
                        exit = true;
                    }
                    break;
                case 4:
                    c1.getCart();
                break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Система не может считать ответ" + "\n" + "Пожалуйста, попробуйте снова");
            }
        } while(!exit);
    };
}
