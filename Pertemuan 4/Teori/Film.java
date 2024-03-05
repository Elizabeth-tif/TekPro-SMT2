import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum KategoriF {
    SU, D, R, A
}

public class Film extends DVD {
    /*
     * Judul : judul film
     * Pemeran : pemeran / pemain dalam film (apabila lebih dari 1 dipisahkan pakai
     * koma)
     * Sutradara : nama sutradara film tersebut
     * Publisher : perusahaan yang memproduksi film tersebut
     * Kategori : (SU = semua umur, D = dewasa, R = remaja, A = anak-anak)
     * Stok : jumlah stok DVD film tersebut
     */

    private List<String> pemeran = new ArrayList<>();
    private String sutradara;
    private KategoriF kategori;

    public Film(String judul, String publisher, int stok) {
        super(judul, publisher, stok);
    }

    public List<String> getPemeran() {
        return pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public KategoriF getKategori() {
        return kategori;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setKategori(KategoriF kategori) {
        this.kategori = kategori;
    }

    public void addPemeran(String actor) {
        pemeran.add(actor);
    }

    @Override
    public void addItems(Scanner scanner) {
        super.addItems(scanner);
        System.out.println("Masukkan nama Sutradara: ");
        scanner.nextLine();
        String inputSut = scanner.nextLine();
        setSutradara(inputSut);

        Character genre = 'X';
        while (genre == 'X') {
            System.out.println("Masukkan Genre [Semua Umur (SU), Dewasa (D), Remaja (R), Anak-anak (A)]: ");
            String inputGenre = scanner.nextLine().toUpperCase();
            switch (inputGenre) {
                case "SU":
                    setKategori(KategoriF.SU);
                    genre = ' ';
                    break;
                case "D":
                    setKategori(KategoriF.D);
                    genre = ' ';
                    break;
                case "R":
                    setKategori(KategoriF.R);
                    genre = ' ';
                    break;
                case "A":
                    setKategori(KategoriF.A);
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
            System.out.println("Masukkan nama Pemeran: ");
            String inputPm = scanner.nextLine();
            addPemeran(inputPm);
            System.out.println("Tambahkan pemeran? (Y/N)");
            more = scanner.nextLine().toUpperCase();
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Kategori: " + kategori);
        System.out.println("Pemeran: ");
        for (int i = 0; i < pemeran.size(); i++) {
            System.out.println(i + 1 + ". " + pemeran.get(i));
        }
    }



}