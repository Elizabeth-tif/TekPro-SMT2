import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

enum KategoriM {
    Classic, Jazz, Pop, Rock, Other
}

public class Musik extends DVD {
    /*
     * Penyanyi : nama penyanyi di album tersebut
     * Produser : nama produser yang memproduseri lagu tersebut
     * Top hits : lagu yang diandalkan dalam album tersebut (apabila lebih dari 1
     * dipisahkan pakai koma)
     * Kategori : (C = classic, J = jazz, P= pop, R= rock, O = Other)
     */

    private String penyanyi;
    private String produser;
    private List<String> top = new ArrayList<>();
    private KategoriM kategori;

    public void addTop(String song) {
        top.add(song);
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public Musik(String judul, String publisher, int stok) {
        super(judul, publisher, stok);
    }

    public String getProduser() {
        return produser;
    }

    public List<String> getTop() {
        return top;
    }

    public KategoriM getKategori() {
        return kategori;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public void setKategori(KategoriM kategori) {
        this.kategori = kategori;
    }

    @Override
    public void addItems(Scanner scanner) {
        super.addItems(scanner);
        System.out.println("Masukkan nama Penyanyi: ");
        scanner.nextLine();
        String inputPenyanyi = scanner.nextLine();
        setPenyanyi(inputPenyanyi);

        System.out.println("Masukkan Produser: ");
        String inputProduser = scanner.nextLine();
        setProduser(inputProduser);

        Character genre = 'X';
        while (genre == 'X') {
            System.out.println("Masukkan Genre [Classic (C), Jazz (J), Pop (P), Rock (R), Other (O)]: ");
            String inputGenre = scanner.nextLine().toUpperCase();
            switch (inputGenre) {
                case "C":
                    setKategori(KategoriM.Classic);
                    genre = ' ';
                    break;
                case "J":
                    setKategori(KategoriM.Jazz);
                    genre = ' ';
                    break;
                case "P":
                    setKategori(KategoriM.Pop);
                    genre = ' ';
                    break;
                case "R":
                    setKategori(KategoriM.Rock);
                    genre = ' ';
                    break;
                case "O":
                    setKategori(KategoriM.Other);
                    genre = ' ';
                    break;
                default:
                    System.out.println("Invalid Genre.");
                    genre = 'X';
                    break;
            }
        }
        String more = "Y";
        while (more.equals("Y")) {
            System.out.println("Masukkan nama lagu Top Hits: ");
            String inputTop = scanner.nextLine();
            addTop(inputTop);
            System.out.println("Tambahkan Top Hits? (Y/N)");
            more = scanner.nextLine().toUpperCase();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.println("Kategori: " + kategori);
        System.out.println("Top Hits: ");
        for (int i = 0; i < top.size(); i++) {
            System.out.println(i + 1 + ". " + top.get(i));
        }
    }

    
}
