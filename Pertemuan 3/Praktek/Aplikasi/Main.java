import java.util.Scanner;

public class Main {
    private static Produk[] menu; 
    private static final Produk[] pesanan = new Produk[10]; 
    private static final Scanner input = new Scanner(System.in);

    private static void isiProduk() {
        menu = new Produk[10];

        menu[0] = new Produk("AOKA", 3_000, 55);
        menu[1] = new Produk("Omurice", 14_999.99, 5);
        menu[2] = new Produk("Mie Import", 20_000, 20);
        menu[3] = new Produk("Susu", 5_000, 30);
        menu[4] = new Produk("Nasi Goreng", 17_000, 15);
        menu[5] = new Produk("Yupi", 500, 10);
        menu[6] = new Produk("Yorkshire Tea", 7_777.77, 77);
        menu[7] = new Produk("Energen", 6_000, 33);
        menu[8] = new Produk("Sus", 3_000.5, 66);
        menu[9] = new Produk("Gorengan", 2_500.02, 99);
    }

    public static void main(String[] args) {
        isiProduk();
        displayMenu(); 
        addOrder(); 
        displayOrders(); 
    }

    public static void displayMenu() {
        System.out.println("                    Menu Makanan");
        System.out.println("====================================================");
        System.out.println("ID          NAMA             HARGA          STOK    ");
        System.out.println("====================================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.format("%-2s | %-20s Rp. %-15.2f %d %n", i + 1, menu[i].getNama(), menu[i].getHarga(), menu[i].getQty());
        }
        System.out.println("----------------------------------------------------");
    }

    public static void addOrder() {
        int idProduk;
        int qty;
        String reorder;
        boolean reorderStatus;
    
        int i = 0;
        do {
            reorderStatus = false;
    
            System.out.println("\nPilih ID Produk yang ingin dipesan: ");
            idProduk = input.nextInt();
            while (idProduk < 1 || idProduk > menu.length || menu[idProduk - 1].getQty() == 0) {
                if (idProduk < 1 || idProduk > menu.length) {
                    System.out.println("Pilihan tidak valid!");
                } else if (menu[idProduk - 1].getQty() == 0) {
                    System.out.println(menu[idProduk - 1].getNama() + " Habis!");
                }
                System.out.println("\nPilih ID Produk yang ingin dipesan: ");
                idProduk = input.nextInt();
            }
    
            System.out.println("Masukkan jumlah item: ");
            qty = input.nextInt();
            while (menu[idProduk - 1].getQty() < qty) {
                System.out.println("Stok  " + menu[idProduk - 1].getNama() + " tidak cukup!");
                System.out.println("\nMasukkan jumlah item: ");
                qty = input.nextInt();
            }
    
            pesanan[i] = new Produk(menu[idProduk - 1].getNama(), menu[idProduk - 1].getHarga(), qty);
            i++;
            
            int remainingQty = menu[idProduk - 1].getQty() - qty;
            menu[idProduk - 1].setQty(remainingQty);
            
            if (i < pesanan.length) {
                System.out.println("Pesan produk lain? [Y/N] ");
                reorder = input.next();
                if (reorder.equalsIgnoreCase("y")){
                    reorderStatus = true;
                    displayMenu();
                }
            }
        } while (i < pesanan.length && reorderStatus);
    }    

    public static void displayOrders() {
        double totalBayar = 0;

        System.out.println("                Order Summary");
        System.out.println("============================================");
        System.out.println("       NAMA         HARGA          Kuantitas");
        System.out.println("============================================");

        for (Produk item : pesanan) {
            if (item != null) {
                System.out.format("%-17s Rp %-17.2f %-3d%n", item.getNama(), item.getHarga(), item.getQty());
                totalBayar += item.getHarga() * item.getQty();
            }
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total                           Rp %.2f%n", totalBayar);
    }
}
