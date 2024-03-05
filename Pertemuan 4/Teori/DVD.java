import java.util.Scanner;

public class DVD {
    private String judul;
    private String publisher;
    private int stok;

    
    public DVD(String judul, String publisher, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stok: " + stok);
    }
    
    public void addItems(Scanner scanner) {
        
        System.out.println("Masukkan Judul " + getClass().getSimpleName() + ": ");
        String inputJudul = scanner.nextLine();
        setJudul(inputJudul);
        
        System.out.println("Masukkan Publisher: ");
        String inputPub = scanner.nextLine();
        setPublisher(inputPub);
        
        System.out.println("Masukkan Jumlah Stok Tersedia ");
        int inputStok = scanner.nextInt();
        setStok(inputStok);
    }
}