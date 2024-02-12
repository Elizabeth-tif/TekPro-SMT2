class ConvertDataType
{
    static short methodOne(long l) {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args) {
        double d = 10.25;
        System.out.println("d= " + d);
        float f = (float) d;
        System.out.println("f= " + f);
        byte b = (byte) methodOne((long) f);
        System.out.println("b= " + b);
    }
}

/*
 * 1.   output dari variable b adalah 10. Angka pertama adalah d bertipe double
 *      yang diubah menjadi float dengan assignment float f yang tidak mengubah nilai angka, 
 *      kemudian menggunakan methodOne pada f, mengubah f menjadi long yang mengubah nilai angka menjadi 10, 
 *      kemudian mengubahnya menjadi int bernilai 10 lalu mengembalikan nilai short yang diubah 
 *      menjadi bytes pada assignment b, hasil adalah 10 karea bisa ditampung oleh semua variabel dari long ke bytes
 * 
 * 2.   d memiliki nilai 10.25 dalam double yang  bisa menampung nilai koma, sedangkan ketika menjadi b, bytes tidak bisa
 *      menyimpan koma jadi nilai hanya menjadi 10 
 */