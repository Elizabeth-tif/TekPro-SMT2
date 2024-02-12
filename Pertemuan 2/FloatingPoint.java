class FloatingPoint{
    public static void main(String[] args) { 
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println(nx);
    }
    }

/* 1.   nx adalah variabel integer yang diisi dengan integer hasil dari math.round(x)
        nilai x adalah 92.98 sehingga math.round(x) akan mngembalikan angka bulat terdekat darix
        yaitu 93, sehingga nx mempunyai nilai 93
        
 * 2.   dibutuhkan casting int dalam menggunakan math.round karena math.round mengembalikan
 *      angka dengan tipe data long, karena nx dideklarasi sebagai int maka harus diubah dulu ke int
 *      tipe data x yaitu double tidak relevan dengan assignment nx setelah dijalankan math.round
 */