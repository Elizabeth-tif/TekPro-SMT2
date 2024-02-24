import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private List<Item> items = new ArrayList<>();

    public Restaurant() {
        
    }

    public void tambahMenuMakanan(int id, String nama, double harga, int stok) {
        items.add(new Item(id, nama, harga, stok));
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayMenu();
        }
    }

    public void pesanMenuMakanan(int nomor, int qty){
        Item items = this.items.get(nomor - 1);
        if (items.getStok() >= qty) {
            System.out.println(qty + " " + items.getNama() + " dipesan!");
            items.setStok(items.getStok() - qty);
        } else if (items.getStok() == 0) {
            System.out.println("Stok " + items.getNama() + " habis!");
        } else {
            System.out.println("Stok " + items.getNama() + " tidak cukup!");
        }
    }
}
