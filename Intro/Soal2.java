    public class Soal2 {
        public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"life": (i>50)?"universe": "everything"; System.out.println(s);
        }
        }

    // output adalah everything
    // menggunakan pengkodisian ternary, karena i tidak lebih kecil dari 30 dan tidak lebih besar dari 50 maka yang dieksekusi
    // adalah hasil else yaitu assign string s dengan everything