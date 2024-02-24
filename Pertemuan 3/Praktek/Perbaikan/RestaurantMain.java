import java.util.Scanner;

public class RestaurantMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        //underscore for number readability
        menu.tambahMenuMakanan(1,"Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan(2,"Gehu", 1_000, 20);
        menu.tambahMenuMakanan(3,"Tahu", 1_000, 0);
        menu.tambahMenuMakanan(4,"Molen", 1_000, 20);
        String pesan = " ";
        
        do {

            System.out.println("Menu makanan:\n");
            menu.tampilMenuMakanan();

            // Pesan makanan
            System.out.println("Pilih makanan untuk dipesan");
            int nomor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kuantitas: ");
            int qty = scanner.nextInt();
            menu.pesanMenuMakanan(nomor, qty);

            System.out.println("Beli lagi? (Y/N)");
            pesan = scanner.next();
            if (pesan.equalsIgnoreCase("n")) {
                break;
            }

        } while (pesan.equalsIgnoreCase("y"));
    }
}
