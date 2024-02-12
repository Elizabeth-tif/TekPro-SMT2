public class Constants {
    public static void main(String[] args) { 
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight *
        CM_PER_INCH);
    }
    }
    
/* 1.   Output constant adalah = Paper size in centimeters: 21.59 by 27.94
        Output constant2 adalah = Paper size in centimeters: 21.59 by 27.94
 * 2.   Perbedaan penggunaan final double dengan public static final double adalah final double tidak bisa diakses diluar tempatnya didefinisikan,
 *      sedangkan public static final double bisa diakses diluar tempatnya dideklarasikan
 *  Persamaannya adalah nilainya tidak bisa diubah setelah nilainya ditetapkan
 */