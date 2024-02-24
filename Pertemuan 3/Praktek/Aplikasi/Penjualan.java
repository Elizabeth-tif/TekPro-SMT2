public class Penjualan {
    private String nama_produk;
    private int qty;
    private double harga_total;

    public Penjualan(String nama, double harga, int qty){
        this.nama_produk = nama;
        this.qty = qty;
        this.harga_total = harga * qty;
    }

    public String getNama(){
        return nama_produk;
    }

    public double getTotal(){
        return harga_total;
    }

    public int getQty() {
        return qty;
    }
}
