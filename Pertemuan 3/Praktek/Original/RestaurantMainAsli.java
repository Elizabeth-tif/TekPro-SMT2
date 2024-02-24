public class RestaurantMainAsli {
    public static void main(String[] args) {
    RestaurantAsli menu = new RestaurantAsli ();
    menu.tambahMenuMakanan ("Bala-Bala", 1_000, 20);
    RestaurantAsli.nextId();
    menu.tambahMenuMakanan ("Gehu", 1000, 20);
    RestaurantAsli.nextId();
    menu.tambahMenuMakanan ("Tahu", 1000, 0);
    RestaurantAsli.nextId();
    menu.tambahMenuMakanan ("Molen", 1000, 20);
    menu.tampilMenuMakanan ();
    }
    }
