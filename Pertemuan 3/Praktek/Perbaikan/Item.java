public class Item {
    private int id = 0; //tidak static karena tidak langsung diimplementasi di class ini dan jika dipanggil di kelas lain idnya akan sama semua ketika diprint
    private String nama;
    private double harga;
    private int stok;
    
    //constructor
    public Item (int id, String nama, double harga, int stok){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getNama(){
        return nama;
    }

    public int getStok(){
        return stok;
    }

    public void setStok (int stok){
        this.stok = stok;
    }

    public void displayMenu(){
        System.out.println(id + ".\t"+ nama + " [" + stok + "]" + "\tRp. " + harga);
    }

}
