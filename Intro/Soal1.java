public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        System.out.println("Hasil 1 "+hasil);
    }
    }

    // hasil -125 karena data type bytes hanya bisa menampung -128 sampai 127 sehingga tejadi bytes overflow
    // reference https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html#:~:text=byte%3A%20The%20byte%20data%20type,the%20memory%20savings%20actually%20matters.