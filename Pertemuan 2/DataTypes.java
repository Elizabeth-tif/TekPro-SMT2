import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create new variable bertipe scanner5
        System.out.println("Number of Case :");
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            try { // exception handling
                System.out.println("Tested number :");
                long n = scanner.nextLong(); // Input integer
                
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close(); // after iteration completed, scanner is closed
    }
}
